package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;

/* renamed from: yzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzk extends AlertDialog implements DialogInterface.OnKeyListener {
    private jjo a;
    private WebView b;
    private boolean c = false;

    /* JADX WARNING: type inference failed for: r7v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yzk(com.google.android.chimera.Activity r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            r6.<init>(r7)
            r0 = 0
            r6.c = r0
            jjo r1 = new jjo
            r1.<init>(r7)
            java.lang.String r8 = defpackage.jjo.a((java.lang.String) r8)
            r1.b = r8
            java.lang.String r8 = defpackage.jjo.a((java.lang.String) r9)
            r1.c = r8
            r8 = 0
            r9 = 1
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x003f }
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x003f }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r0] = r4     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "get"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch:{ Exception -> 0x003f }
            r2.setAccessible(r9)     // Catch:{ Exception -> 0x003f }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "ro.carrier"
            r3[r0] = r4     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "wifi-only"
            java.lang.Object r2 = r2.invoke(r8, r3)     // Catch:{ Exception -> 0x003f }
            boolean r2 = r4.equals(r2)     // Catch:{ Exception -> 0x003f }
            goto L_0x0041
        L_0x003f:
            r2 = move-exception
            r2 = 0
        L_0x0041:
            if (r2 != 0) goto L_0x0047
            r2 = 2131952342(0x7f1302d6, float:1.9541124E38)
            goto L_0x004a
        L_0x0047:
            r2 = 2131952343(0x7f1302d7, float:1.9541126E38)
        L_0x004a:
            java.lang.String r2 = r7.getString(r2)
            android.content.Context r3 = r1.a
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r4 = r1.c
            r9[r0] = r4
            java.lang.String r9 = java.lang.String.format(r3, r2, r9)
            r1.d = r9
            r1.b()
            android.webkit.WebView r9 = r1.e
            java.lang.String r2 = r1.b
            r9.loadUrl(r2)
            r6.a = r1
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x007b
            r6.setTitle(r10)
        L_0x007b:
            r9 = 2131952099(0x7f1301e3, float:1.9540631E38)
            java.lang.CharSequence r9 = r7.getText(r9)
            yzj r10 = new yzj
            r10.<init>()
            r1 = -1
            r6.setButton(r1, r9, r10)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            android.content.Context r10 = r6.getContext()
            r9.<init>(r10)
            android.util.DisplayMetrics r10 = new android.util.DisplayMetrics
            r10.<init>()
            android.view.WindowManager r7 = r7.getWindowManager()
            android.view.Display r7 = r7.getDefaultDisplay()
            r7.getMetrics(r10)
            int r7 = r10.heightPixels
            if (r7 <= 0) goto L_0x00ba
            int r7 = r10.heightPixels
            double r2 = (double) r7
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            int r7 = (int) r2
            goto L_0x00bb
        L_0x00ba:
            r7 = -1
        L_0x00bb:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r1, r7)
            jjo r7 = r6.a
            android.view.ViewGroup r7 = r7.a()
            r9.addView(r7, r10)
            jjo r7 = r6.a
            android.view.ViewGroup r7 = r7.a()
        L_0x00cf:
            int r10 = r7.getChildCount()
            if (r0 >= r10) goto L_0x00e8
            android.view.View r10 = r7.getChildAt(r0)
            boolean r10 = r10 instanceof android.webkit.WebView
            if (r10 == 0) goto L_0x00e5
            android.view.View r7 = r7.getChildAt(r0)
            r8 = r7
            android.webkit.WebView r8 = (android.webkit.WebView) r8
            goto L_0x00e9
        L_0x00e5:
            int r0 = r0 + 1
            goto L_0x00cf
        L_0x00e8:
        L_0x00e9:
            r6.b = r8
            r6.setOnKeyListener(r6)
            r6.setView(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzk.<init>(com.google.android.chimera.Activity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private final void a(int i) {
        WebView webView = this.b;
        if (webView != null && qb.a((View) webView, i)) {
            this.b.scrollBy(0, i);
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        jjo jjo = this.a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && jjo.e.canGoBack()) {
            jjo.e.goBack();
            return true;
        } else if (keyEvent.getKeyCode() == 19) {
            a(-20);
            return true;
        } else if (keyEvent.getKeyCode() != 20) {
            return false;
        } else {
            a(20);
            return true;
        }
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        if (!this.c) {
            this.c = true;
            if (!(layoutParams.width == -1 && layoutParams.height == -1)) {
                getWindow().setLayout(-1, -1);
            }
            this.c = false;
        }
    }
}
