package defpackage;

import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apn {
    public ArrayList a = new ArrayList();
    public int b;
    public boolean c;
    public int d = -1;
    public SliceItem e;

    public apn(SliceItem sliceItem) {
        String str = sliceItem.b;
        if (sliceItem.a("shortcut") || (!"slice".equals(str) && !"action".equals(str))) {
            String str2 = sliceItem.b;
            if (!"content_description".equals(sliceItem.c)) {
                if (!sliceItem.a("keywords", "ttl", "last_updated") && ("text".equals(str2) || "long".equals(str2) || "image".equals(str2))) {
                    this.a.add(sliceItem);
                }
            }
        } else {
            List c2 = sliceItem.f().c();
            if (c2.size() == 1 && ("action".equals(((SliceItem) c2.get(0)).b) || "slice".equals(((SliceItem) c2.get(0)).b))) {
                SliceItem sliceItem2 = (SliceItem) c2.get(0);
                c2 = ((SliceItem) c2.get(0)).f().c();
            }
            "action".equals(str);
            this.b = 0;
            char c3 = 0;
            for (int i = 0; i < c2.size(); i++) {
                SliceItem sliceItem3 = (SliceItem) c2.get(i);
                String str3 = sliceItem3.b;
                if (!"content_description".equals(sliceItem3.c)) {
                    if (this.b < 2 && ("text".equals(str3) || "long".equals(str3))) {
                        this.b++;
                        this.a.add(sliceItem3);
                        SliceItem sliceItem4 = this.e;
                        if (sliceItem4 == null || (!sliceItem4.a("title") && sliceItem3.a("title"))) {
                            this.e = sliceItem3;
                        }
                    } else if (c3 <= 0 && "image".equals(sliceItem3.b)) {
                        this.d = apd.a(sliceItem3);
                        this.c = true;
                        this.a.add(sliceItem3);
                        c3 = 1;
                    }
                }
            }
        }
        a();
    }

    public final boolean a() {
        return this.a.size() > 0 && this.a.size() <= 3;
    }
}
