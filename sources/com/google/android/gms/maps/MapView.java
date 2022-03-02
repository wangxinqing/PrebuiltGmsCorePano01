package com.google.android.gms.maps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MapView extends FrameLayout {
    private final mbv a;

    public MapView(Context context) {
        super(context);
        this.a = new mbv(this, context, (GoogleMapOptions) null);
        e();
    }

    private final void e() {
        setClickable(true);
    }

    public final void a() {
        mbv mbv = this.a;
        mbv.a((Bundle) null, new mbt(mbv));
    }

    public final void b() {
        mbv mbv = this.a;
        rqq rqq = mbv.c;
        if (rqq == null) {
            mbv.a(5);
            return;
        }
        try {
            rqq.b.c();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void c() {
        mbv mbv = this.a;
        rqq rqq = mbv.c;
        if (rqq == null) {
            mbv.a(1);
            return;
        }
        try {
            rqq.b.d();
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final void d() {
        rqq rqq = this.a.c;
        if (rqq != null) {
            try {
                rqq.b.e();
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new mbv(this, context, GoogleMapOptions.a(context, attributeSet));
        e();
    }

    public final void a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mbv mbv = this.a;
            mbv.a(bundle, new mbr(mbv, bundle));
            if (this.a.c == null) {
                hxj hxj = hxj.a;
                Context context = getContext();
                int b = hxj.b(context);
                String c = isf.c(context, b);
                String e = isf.e(context, b);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(c);
                linearLayout.addView(textView);
                Intent b2 = hxj.b(context, b, (String) null);
                if (b2 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(e);
                    linearLayout.addView(button);
                    button.setOnClickListener(new mbs(context, b2));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new mbv(this, context, GoogleMapOptions.a(context, attributeSet));
        e();
    }

    public final void b(Bundle bundle) {
        mbv mbv = this.a;
        rqq rqq = mbv.c;
        if (rqq != null) {
            try {
                Bundle bundle2 = new Bundle();
                rut.a(bundle, bundle2);
                rqq.b.b(bundle2);
                rut.a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } else {
            Bundle bundle3 = mbv.a;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new mbv(this, context, googleMapOptions);
        e();
    }

    public final void a(rqs rqs) {
        iva.a("getMapAsync() must be called on the main thread");
        mbv mbv = this.a;
        rqq rqq = mbv.c;
        if (rqq == null) {
            mbv.d.add(rqs);
        } else {
            rqq.a(rqs);
        }
    }
}
