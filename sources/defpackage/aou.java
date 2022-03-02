package defpackage;

import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aou extends aov implements aor {
    private boolean a;
    private boolean b;
    private boolean c;

    public aou(anr anr, SliceSpec sliceSpec) {
        super(anr, sliceSpec, (byte[]) null);
    }

    private final void a(boolean z) {
        if (!this.a) {
            this.a = true;
            this.b = true;
            this.c = z;
        }
    }

    public final void b() {
        this.f.b(-1, "millis", "ttl");
    }

    public final Slice c() {
        Slice c2 = super.c();
        SliceItem b2 = apl.b(c2, (String) null, "partial");
        SliceItem b3 = apl.b(c2, "slice", "list_item");
        String[] strArr = {"shortcut", "title"};
        SliceItem a2 = apl.a(c2, "action", strArr, (String[]) null);
        ArrayList arrayList = new ArrayList();
        apl.a(apl.a(c2), (apk) new ape("slice", strArr), (List) arrayList);
        if (b2 == null && b3 != null && a2 == null && arrayList.isEmpty()) {
            throw new IllegalStateException("A slice requires a primary action; ensure one of your builders has called #setPrimaryAction with a valid SliceAction.");
        }
        if (this.a) {
            if (!this.b) {
                throw new IllegalStateException("A slice cannot have the first row be constructed from a GridRowBuilder, consider using #setHeader.");
            } else if (!this.c) {
                throw new IllegalStateException("A slice requires the first row to have some text.");
            }
        }
        return c2;
    }

    public final void a() {
        this.f.a(-1, "color", new String[0]);
    }

    public final void a(anr anr) {
        anr.a(System.currentTimeMillis(), "millis", "last_updated");
    }

    public final void a(aon aon) {
        aot aot = new aot(new anr(this.f));
        aot.a = aon.c;
        IconCompat iconCompat = aon.b;
        if (iconCompat != null) {
            int i = aon.a;
            anr anr = new anr(aot.f);
            anr.a(iconCompat, (String) null, (List) aov.a(i, false));
            anr.a("title");
            aot.d = anr.a();
        }
        CharSequence charSequence = aon.d;
        if (charSequence != null) {
            aot.b = new SliceItem(charSequence, "text", (String) null, new String[]{"title"});
        }
        CharSequence charSequence2 = aon.e;
        if (charSequence2 != null) {
            aot.c = new SliceItem(charSequence2, "text", (String) null, new String[0]);
        }
        List list = aon.f;
        List list2 = aon.g;
        List list3 = aon.h;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int intValue = ((Integer) list2.get(i2)).intValue();
            if (intValue == 0) {
                long longValue = ((Long) list.get(i2)).longValue();
                ArrayList arrayList = aot.e;
                anr anr2 = new anr(aot.f);
                anr2.b(longValue, (String) null, new String[0]);
                arrayList.add(anr2.a());
            } else if (intValue == 1) {
                oq oqVar = (oq) list.get(i2);
                int intValue2 = ((Integer) oqVar.b).intValue();
                boolean booleanValue = ((Boolean) list3.get(i2)).booleanValue();
                anr anr3 = new anr(aot.f);
                anr3.a((IconCompat) oqVar.a, (String) null, (List) aov.a(intValue2, booleanValue));
                if (booleanValue) {
                    anr3.a("partial");
                }
                aot.e.add(anr3.a());
            } else if (intValue == 2) {
                aop aop = (aop) list.get(i2);
                boolean booleanValue2 = ((Boolean) list3.get(i2)).booleanValue();
                anr anr4 = new anr(aot.f);
                if (booleanValue2) {
                    anr4.a("partial");
                }
                ArrayList arrayList2 = aot.e;
                apd apd = aop.a;
                anr4.a("shortcut");
                anr4.a(apd.a, apd.a(anr4).a(), apd.b());
                arrayList2.add(anr4.a());
            }
        }
        a(aot.a());
        a(aot.a());
        aot.f.a("list_item");
        this.f.a(aot.c());
    }
}
