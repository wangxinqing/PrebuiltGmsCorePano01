package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: idj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idj implements Runnable {
    final /* synthetic */ idk a;
    private final idh b;

    public idj(idk idk, idh idh) {
        this.a = idk;
        this.b = idh;
    }

    public final void run() {
        if (this.a.b) {
            ConnectionResult connectionResult = this.b.b;
            if (connectionResult.a()) {
                idk idk = this.a;
                idk.e.startActivityForResult(GoogleApiActivity.a(idk.f(), connectionResult.d, this.b.a, false), 1);
            } else if (hxz.b(connectionResult.c)) {
                idk idk2 = this.a;
                hxj hxj = idk2.d;
                Activity f = idk2.f();
                idk idk3 = this.a;
                ify ify = idk3.e;
                int i = connectionResult.c;
                Dialog a2 = hxj.a((Context) f, i, (isl) new isk(hxj.b(f, i, "d"), ify), (DialogInterface.OnCancelListener) idk3);
                if (a2 != null) {
                    hxj.a(f, a2, "GooglePlayServicesErrorDialog", (DialogInterface.OnCancelListener) idk3);
                }
            } else if (connectionResult.c != 18) {
                this.a.a(connectionResult, this.b.a);
            } else {
                idk idk4 = this.a;
                hxj hxj2 = idk4.d;
                Activity f2 = idk4.f();
                idk idk5 = this.a;
                ProgressBar progressBar = new ProgressBar(f2, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(f2);
                builder.setView(progressBar);
                builder.setMessage(isf.c(f2, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                hxj2.a(f2, (Dialog) create, "GooglePlayServicesUpdatingDialog", (DialogInterface.OnCancelListener) idk5);
                idk idk6 = this.a;
                idk6.d.a(idk6.f().getApplicationContext(), (ifp) new idi(this, create));
            }
        }
    }
}
