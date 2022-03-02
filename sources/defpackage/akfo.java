package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.pano.widget.CursorWebView;

/* renamed from: akfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfo extends BroadcastReceiver {
    final /* synthetic */ CursorWebView a;

    public akfo(CursorWebView cursorWebView) {
        this.a = cursorWebView;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("scroll")) {
            CursorWebView cursorWebView = this.a;
            int i = CursorWebView.s;
            cursorWebView.l = (float) intent.getIntExtra("accel", (int) cursorWebView.l);
            CursorWebView cursorWebView2 = this.a;
            cursorWebView2.i = intent.getIntExtra("min", cursorWebView2.i);
            CursorWebView cursorWebView3 = this.a;
            cursorWebView3.j = intent.getIntExtra("max", cursorWebView3.j);
            CursorWebView cursorWebView4 = this.a;
            cursorWebView4.k = intent.getIntExtra("aMax", cursorWebView4.k);
            CursorWebView cursorWebView5 = this.a;
            float f = cursorWebView5.l;
            int i2 = cursorWebView5.i;
            int i3 = cursorWebView5.j;
            int i4 = cursorWebView5.k;
            StringBuilder sb = new StringBuilder(84);
            sb.append("duration ");
            sb.append(f);
            sb.append(" min ");
            sb.append(i2);
            sb.append(" max ");
            sb.append(i3);
            sb.append(" accelerated max ");
            sb.append(i4);
            sb.toString();
        } else if (action.equals("size")) {
            CursorWebView cursorWebView6 = this.a;
            int i5 = CursorWebView.s;
            cursorWebView6.g = intent.getFloatExtra("w", cursorWebView6.g);
            CursorWebView cursorWebView7 = this.a;
            cursorWebView7.h = intent.getFloatExtra("h", cursorWebView7.h);
            CursorWebView cursorWebView8 = this.a;
            cursorWebView8.b.b(cursorWebView8.g, cursorWebView8.h);
            CursorWebView cursorWebView9 = this.a;
            cursorWebView9.o = intent.getIntExtra("margin", cursorWebView9.o);
            int intExtra = intent.getIntExtra("drawMargin", this.a.p);
            CursorWebView cursorWebView10 = this.a;
            if (intExtra != cursorWebView10.p) {
                cursorWebView10.p = intExtra;
                cursorWebView10.onSizeChanged(cursorWebView10.getWidth(), this.a.getHeight(), this.a.getWidth(), this.a.getHeight());
            }
            CursorWebView cursorWebView11 = this.a;
            float f2 = cursorWebView11.g;
            float f3 = cursorWebView11.h;
            int i6 = cursorWebView11.o;
            int i7 = cursorWebView11.p;
            StringBuilder sb2 = new StringBuilder(87);
            sb2.append("width ");
            sb2.append(f2);
            sb2.append(" height ");
            sb2.append(f3);
            sb2.append(" margin ");
            sb2.append(i6);
            sb2.append(" draw margin ");
            sb2.append(i7);
            sb2.toString();
        } else if (action.equals("cursor")) {
            CursorWebView cursorWebView12 = this.a;
            int i8 = CursorWebView.s;
            cursorWebView12.f = intent.getIntExtra("radius", cursorWebView12.f);
            CursorWebView cursorWebView13 = this.a;
            cursorWebView13.d = intent.getIntExtra("color", cursorWebView13.d);
            CursorWebView cursorWebView14 = this.a;
            cursorWebView14.e = intent.getIntExtra("color2", cursorWebView14.e);
            CursorWebView cursorWebView15 = this.a;
            int i9 = cursorWebView15.f;
            int i10 = cursorWebView15.d;
            int i11 = cursorWebView15.e;
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("radius ");
            sb3.append(i9);
            sb3.append(" color ");
            sb3.append(i10);
            sb3.append(" color2 ");
            sb3.append(i11);
            sb3.toString();
        }
    }
}
