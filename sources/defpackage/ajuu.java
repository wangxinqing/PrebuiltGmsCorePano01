package defpackage;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: ajuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajuu extends BaseAdapter {
    private static final int d = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    private final Calendar a;
    private final int b;
    private final int c = this.a.getFirstDayOfWeek();

    public ajuu() {
        Calendar c2 = ajvz.c();
        this.a = c2;
        this.b = c2.getMaximum(7);
    }

    private final int a(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public final int getCount() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i < this.b) {
            return Integer.valueOf(a(i));
        }
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0019
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624616(0x7f0e02a8, float:1.8876417E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            java.util.Calendar r7 = r5.a
            int r6 = r5.a(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.a
            int r7 = d
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131953289(0x7f130689, float:1.9543045E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
