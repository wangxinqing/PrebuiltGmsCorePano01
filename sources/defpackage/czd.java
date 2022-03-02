package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: czd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class czd extends cyi {
    private final aqtu c;
    private final dih d;
    private final Fragment e;
    private final iwd f;
    private final cvm g;

    public czd(aqtu aqtu, dih dih, Fragment fragment, iwd iwd, cvm cvm, czc czc, czb czb) {
        super(czc, czb);
        this.c = aqtu;
        this.d = dih;
        this.e = fragment;
        this.f = iwd;
        this.g = cvm;
    }

    public final void a() {
        Intent intent;
        if (!dio.a(this.d)) {
            this.b.a(new IllegalArgumentException("No account"));
        } else if ((this.c.a & 1) == 0) {
            this.b.a(new IllegalArgumentException("No URL"));
        } else if (!jkf.a(ihs.b())) {
            this.b.a(new babk(babj.f));
        } else {
            try {
                jix.g(this.e.getContext());
                int i = 2;
                if (ayof.b()) {
                    aucd o = wkf.g.o();
                    String str = this.c.b;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    wkf wkf = (wkf) o.b;
                    str.getClass();
                    wkf.a = str;
                    String str2 = this.d.a;
                    str2.getClass();
                    wkf.b = str2;
                    wkf.c = 3;
                    wkf.d = 2;
                    if (qud.b == null) {
                        i = 1;
                    } else if (qud.b.booleanValue()) {
                        i = 3;
                    }
                    int i2 = i - 1;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    wkf wkf2 = (wkf) o.b;
                    wkf2.e = i2;
                    String str3 = this.g.a;
                    str3.getClass();
                    wkf2.f = str3;
                    wkf wkf3 = (wkf) o.i();
                    iva.a(ayof.b(), (Object) "This create intent method should only be called when octarine_dark_mode_override_enabled is set to true.");
                    iva.c(wkf3.b);
                    iva.c(wkf3.a);
                    intent = new Intent().setAction("com.google.android.gms.octarine.VIEW").setPackage("com.google.android.gms").putExtra("extra.url", wkf3.a).putExtra("extra.accountName", wkf3.b).putExtra("extra.initialTitleType", wkf3.c).putExtra("extra.initialAccountDisplay", wkf3.d).putExtra("extra.themeChoice", wkf3.e).putExtra("extra.callingPackageName", wkf3.f);
                } else {
                    String str4 = this.c.b;
                    String str5 = this.d.a;
                    String str6 = this.g.a;
                    iva.c(str4);
                    iva.c(str5);
                    intent = new Intent().setAction("com.google.android.gms.octarine.VIEW").setPackage("com.google.android.gms").putExtra("extra.url", str4).putExtra("extra.accountName", str5).putExtra("extra.initialTitleType", 3).putExtra("extra.initialAccountDisplay", 2).putExtra("extra.callingPackageName", str6);
                }
                if (awgy.a.a().n()) {
                    Activity containerActivity = this.e.getActivity().getContainerActivity();
                    View findViewById = this.e.getActivity().findViewById(R.id.toolbar);
                    String string = this.e.getResources().getString(R.string.as_header_transition_name);
                    int i3 = Build.VERSION.SDK_INT;
                    this.e.getActivity().startActivityForResult(intent, 6, new fq(ActivityOptions.makeSceneTransitionAnimation(containerActivity, findViewById, string)).a.toBundle());
                } else {
                    this.e.startActivityForResult(intent, 6);
                }
                this.a.a(true);
            } catch (ActivityNotFoundException e2) {
                this.f.b("Error starting webview", e2, new Object[0]);
                this.b.a(e2);
            }
        }
    }
}
