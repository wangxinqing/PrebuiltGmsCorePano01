package defpackage;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anz {
    private Slice a;
    private apq b;
    private aps c;
    private List d;

    private anz(Slice slice) {
        aps aps;
        SliceItem sliceItem;
        SliceItem sliceItem2;
        SliceItem sliceItem3;
        int i;
        apd apd;
        this.a = slice;
        SliceItem b2 = apl.b(slice, "long", "ttl");
        if (b2 != null) {
            b2.g();
        }
        SliceItem b3 = apl.b(slice, "long", "last_updated");
        if (b3 != null) {
            b3.g();
        }
        apq apq = new apq(slice);
        this.b = apq;
        this.c = apq.b;
        aps aps2 = apq.b;
        List list = apq.c;
        if (aps2 != null) {
            SliceItem sliceItem4 = aps2.a;
            if (sliceItem4 != null) {
                apd = new apd(sliceItem4);
            } else {
                apd = null;
            }
            SliceItem sliceItem5 = aps2.d;
            if (sliceItem5 != null) {
                "action".equals(sliceItem5.b);
            } else if (aps2.e == null && (apd == null || !apd.d)) {
                if (list == null) {
                    aps2.c.size();
                } else {
                    int i2 = 0;
                    while (i2 < list.size() && !((apc) list.get(i2)).c()) {
                        i2++;
                    }
                }
            }
        }
        apq apq2 = this.b;
        if (apq2.a == null && (sliceItem = apq2.f) != null) {
            SliceItem b4 = apl.b(sliceItem, "action", new String[]{"title", "shortcut"}, (String[]) null);
            if (b4 != null) {
                sliceItem3 = apl.b(b4, "image", "title");
                sliceItem2 = apl.b(b4, "text", (String) null);
            } else {
                sliceItem3 = null;
                sliceItem2 = null;
            }
            b4 = b4 == null ? apl.b(apq2.f, "action", (String) null) : b4;
            sliceItem3 = sliceItem3 == null ? apl.b(apq2.f, "image", "title") : sliceItem3;
            sliceItem2 = sliceItem2 == null ? apl.b(apq2.f, "text", "title") : sliceItem2;
            sliceItem3 = sliceItem3 == null ? apl.b(apq2.f, "image", (String) null) : sliceItem3;
            sliceItem2 = sliceItem2 == null ? apl.b(apq2.f, "text", (String) null) : sliceItem2;
            if (sliceItem3 != null) {
                i = apd.a(sliceItem3);
            } else {
                i = 5;
            }
            if (!(sliceItem3 == null || b4 == null || sliceItem2 == null)) {
                new apd(b4.d(), sliceItem3.c(), i, sliceItem2.b());
            }
        }
        List list2 = this.b.c;
        this.d = list2;
        if (list2 == null && (aps = this.c) != null) {
            if (apl.b(aps.f, "list_item")) {
                ArrayList arrayList = this.c.b;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (apl.a((SliceItem) arrayList.get(i3), "action") != null) {
                        arrayList2.add(new apd((SliceItem) arrayList.get(i3)));
                    }
                }
                if (arrayList2.size() > 0) {
                    this.d = arrayList2;
                }
            }
        }
    }

    public static anz a(Slice slice) {
        return new anz(slice);
    }

    public final int a() {
        SliceItem b2 = apl.b(this.a, (String) null, "partial");
        if (this.b.a()) {
            return b2 == null ? 2 : 1;
        }
        return 0;
    }
}
