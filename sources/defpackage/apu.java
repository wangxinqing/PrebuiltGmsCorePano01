package defpackage;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.List;

/* renamed from: apu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apu {
    public SliceItem f;

    public apu(Slice slice) {
        List d = slice.d();
        a(new SliceItem(slice, "slice", (String) null, (String[]) d.toArray(new String[d.size()])));
    }

    private final void a(SliceItem sliceItem) {
        this.f = sliceItem;
        if ("slice".equals(sliceItem.b) || "action".equals(sliceItem.b)) {
            apl.a(sliceItem.f(), "int", "color", (String[]) null);
            apl.a(sliceItem.f(), "int", "layout_direction", (String[]) null);
        }
        apl.a(sliceItem, "text", "content_description");
    }

    public boolean a() {
        return this.f != null;
    }

    public apu(SliceItem sliceItem) {
        if (sliceItem != null) {
            a(sliceItem);
        }
    }
}
