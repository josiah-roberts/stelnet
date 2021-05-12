package stelnet.market.view;

import com.fs.starfarer.api.ui.TooltipMakerAPI;

import stelnet.market.IntelSubject;
import stelnet.ui.AbstractRenderable;
import stelnet.ui.Size;

public class LegacyIntel extends AbstractRenderable {

    private IntelSubject subject;

    public LegacyIntel(IntelSubject subject, Size size) {
        this.subject = subject;
        setSize(size);
    }

    @Override
    public void render(TooltipMakerAPI tooltip) {
        Size size = getSize();
        subject.createSmallDescription(tooltip, size.getWidth(), size.getHeight());
    }
}