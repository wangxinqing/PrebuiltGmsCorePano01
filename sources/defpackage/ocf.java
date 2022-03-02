package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.List;

/* renamed from: ocf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocf extends RatingBar implements obf, ocz {
    public final boolean a;
    public oct b;
    private final List c;
    private final TextView d;
    private final obg e;
    private List f;

    public ocf(Context context, obg obg, avnl avnl, List list, TextView textView) {
        super(context);
        setTag(avnl.b);
        setNumStars(list.size());
        setStepSize(1.0f);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.c = list;
        this.d = textView;
        this.e = obg;
        this.a = avnl.f;
        setOnRatingBarChangeListener(new ocd(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.c
            int r0 = r0.size()
            if (r3 <= r0) goto L_0x000e
            java.util.List r3 = r2.c
            int r3 = r3.size()
        L_0x000e:
            android.content.Context r0 = r2.getContext()
            r1 = 2131952904(0x7f130508, float:1.9542264E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r3 <= 0) goto L_0x003a
            int r3 = r3 + -1
            java.util.List r1 = r2.c
            java.lang.Object r1 = r1.get(r3)
            avnl r1 = (defpackage.avnl) r1
            int r1 = r1.a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x003a
            java.util.List r1 = r2.c
            java.lang.Object r3 = r1.get(r3)
            avnl r3 = (defpackage.avnl) r3
            java.lang.String r3 = r3.c
            goto L_0x003c
        L_0x003a:
            java.lang.String r3 = ""
        L_0x003c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            if (r1 != 0) goto L_0x004c
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x0050
        L_0x004c:
            java.lang.String r3 = r0.concat(r3)
        L_0x0050:
            android.widget.TextView r0 = r2.d
            r0.setText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocf.a(int):void");
    }

    public final void a(oct oct) {
        this.b = oct;
    }

    public final boolean b() {
        return this.e.getVisibility() == 0;
    }

    public final String d() {
        int rating = (int) getRating();
        if (rating > 0) {
            return ((avnl) this.c.get(rating - 1)).b;
        }
        return null;
    }

    public final void e() {
        List list = this.f;
        if (list != null) {
            ocv.a(list);
            oct oct = this.b;
            if (oct != null) {
                oct.a();
            }
        }
    }

    public final void a(List list) {
        this.f = list;
        setOnRatingBarChangeListener(new oce(this));
    }

    public final boolean a() {
        return ((int) getRating()) > 0;
    }
}
