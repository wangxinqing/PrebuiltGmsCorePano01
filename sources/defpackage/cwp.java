package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* renamed from: cwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cwp extends czi {
    public final LinearLayout a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cwp(android.content.Context r6, java.util.List r7, defpackage.cyg r8, android.widget.LinearLayout r9, defpackage.djk r10) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x001d
            java.lang.Object r3 = r7.get(r2)
            aqpm r3 = (defpackage.aqpm) r3
            cwg r4 = new cwg
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x001d:
            r5.<init>(r6, r0, r8, r10)
            r5.a = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwp.<init>(android.content.Context, java.util.List, cyg, android.widget.LinearLayout, djk):void");
    }

    public final int a(int i) {
        return R.layout.as_card_action_chip;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new cwj(this, LayoutInflater.from(this.j).inflate(i, viewGroup, false), this.k);
    }
}
