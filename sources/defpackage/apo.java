package defpackage;

import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apo extends apu {
    private ArrayList a = new ArrayList();
    private SliceItem b;
    private int c;
    private boolean d;
    private int e = 5;
    private SliceItem g;

    public apo(SliceItem sliceItem) {
        super(sliceItem);
        boolean z;
        List c2;
        SliceItem b2 = apl.b(sliceItem, (String) null, "see_more");
        this.b = b2;
        if (b2 != null && "slice".equals(b2.b) && (c2 = this.b.f().c()) != null && c2.size() > 0) {
            this.b = (SliceItem) c2.get(0);
        }
        apl.b(sliceItem, "slice", new String[]{"shortcut", "title"}, new String[]{"actions"});
        if ("slice".equals(sliceItem.b)) {
            List c3 = sliceItem.f().c();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c3.size(); i++) {
                SliceItem sliceItem2 = (SliceItem) c3.get(i);
                if (apl.b(sliceItem2, (String) null, "see_more") == null) {
                    if (!sliceItem2.a("shortcut", "see_more", "keywords", "ttl", "last_updated")) {
                        z = false;
                        if (!"content_description".equals(sliceItem2.c) && !z) {
                            arrayList.add(sliceItem2);
                        }
                    }
                }
                z = true;
                arrayList.add(sliceItem2);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                SliceItem sliceItem3 = (SliceItem) arrayList.get(i2);
                if (!"content_description".equals(sliceItem3.c)) {
                    a(new apn(sliceItem3));
                }
            }
        } else {
            a(new apn(sliceItem));
        }
        if (super.a()) {
            this.a.size();
        }
    }

    private final void a(apn apn) {
        SliceItem sliceItem;
        if (apn.a()) {
            if (this.g == null && (sliceItem = apn.e) != null) {
                this.g = sliceItem;
            }
            this.a.add(apn);
            if (apn.a.size() == 1) {
                "image".equals(((SliceItem) apn.a.get(0)).b);
            }
            this.c = Math.max(this.c, apn.b);
            this.d |= apn.c;
            int i = this.e;
            this.e = i != 5 ? Math.max(i, apn.d) : apn.d;
        }
    }
}
