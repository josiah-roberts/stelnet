package stelnet.storage.view;

import com.fs.starfarer.api.util.Misc;

import stelnet.L10n;
import stelnet.ui.AreaCheckbox;
import stelnet.ui.property.Size;

public abstract class FilteringButton extends AreaCheckbox {

    public FilteringButton(String translationId) {
        super(new Size(180, 24), L10n.get(translationId), true, true, Misc.getHighlightColor(), Misc.getGrayColor());
    }
}
