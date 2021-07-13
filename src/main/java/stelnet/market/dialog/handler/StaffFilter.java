package stelnet.market.dialog.handler;

import stelnet.market.dialog.DialogOption;
import stelnet.market.dialog.DialogPlugin;
import stelnet.market.filter.MutableFilterManager;

public class StaffFilter implements DialogHandler {
    private final DialogOption option;

    public StaffFilter(DialogOption o) {
        option = o;
    }

    @Override
    public DialogOption handle(DialogPlugin plugin) {
        MutableFilterManager filterManager = plugin.getFilterManager();
        filterManager.setStaffType(option);
        filterManager.setStaffOfficer(option);

        DialogOption o = filterManager.getStaffType();
        if (o.equals(DialogOption.STAFF_TYPE_ADMIN)) {
            plugin.addOptions(DialogOption.STAFF, filterManager.getStaffType(), DialogOption.INIT);
        } else if (o.equals(DialogOption.STAFF_TYPE_OFFICER)) {
            plugin.addOptions(DialogOption.STAFF, filterManager.getStaffType(), filterManager.getStaffOfficer(),
                    DialogOption.INIT);
        }
        plugin.setEscShortcut(DialogOption.INIT);

        return DialogOption.STAFF;
    }
}