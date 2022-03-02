package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;

/* renamed from: xrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xrh {
    static final void a(Context context, ibz ibz) {
        ibz.a(mvd.b);
        wun.b();
        anhk i = wun.a(context).listIterator();
        while (i.hasNext()) {
            anhk i2 = ((wum) i.next()).a().listIterator();
            while (i2.hasNext()) {
                ((wuk) i2.next()).b();
            }
        }
    }

    static final void a(ViewGroup viewGroup, icc icc) {
        wun.b();
        anhk i = wun.a(viewGroup.getContext()).listIterator();
        while (i.hasNext()) {
            wum wum = (wum) i.next();
            Context context = viewGroup.getContext();
            Button button = new Button(context);
            button.setVisibility(8);
            button.setText(wum.a);
            Boolean bool = wum.d;
            if (bool != null ? bool.booleanValue() : jgu.b(context)) {
                button.setOnClickListener(new xrf(icc, wum));
                button.setVisibility(0);
            }
            viewGroup.addView(button);
        }
    }
}
