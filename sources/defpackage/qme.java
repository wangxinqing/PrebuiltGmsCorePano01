package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.instantapps.ui.InstallSupervisorChimeraFragment$2;

/* renamed from: qme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qme extends qnh {
    public static final qfn a = new qfn("InstallSupervisorChimeraFragment");
    private static final Intent g = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
    public boolean b;
    public cpw c;
    private TextView h;
    private int i = 0;
    private final ServiceConnection j = new qmd(this, "instantapps");
    private final BroadcastReceiver k = new InstallSupervisorChimeraFragment$2(this, "instantapps");

    public final void a() {
        a("InstallSupervisorFragment.Failure");
        qne qne = this.e;
        if (qne != null) {
            qne.a(0);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d.k();
        if (bundle != null) {
            this.b = bundle.getBoolean("InstallRequested", false);
            this.i = bundle.getInt("LastInstallUpdate", 0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.setup_download_supervisor_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        this.h = textView;
        textView.setText(getString(R.string.supervisor_downloading_description, getString(R.string.supervisor_title)));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("InstallRequested", this.b);
        bundle.putInt("LastInstallUpdate", this.i);
    }

    public final void onStart() {
        super.onStart();
        if (this.b) {
            a(this.i);
        } else if (!getActivity().bindService(g, this.j, 1)) {
            a.b("Failed to bind to service", new Object[0]);
            a();
        }
        getActivity().registerReceiver(this.k, new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS"));
    }

    public final void onStop() {
        super.onStop();
        if (this.c != null) {
            try {
                getActivity().unbindService(this.j);
            } catch (IllegalArgumentException e) {
                a.a(e);
            }
            this.c = null;
        }
        getActivity().unregisterReceiver(this.k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r6.h.setText(getString(r7, getString(com.google.android.gms.R.string.supervisor_title)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r2 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        a("InstallSupervisorFragment.Success");
        r7 = r6.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r7 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r7.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r7 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7) {
        /*
            r6 = this;
            r6.i = r7
            r0 = 1
            r1 = 0
            switch(r7) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0025;
                case 2: goto L_0x0021;
                case 3: goto L_0x0021;
                case 4: goto L_0x001d;
                case 5: goto L_0x0021;
                case 6: goto L_0x001a;
                default: goto L_0x0007;
            }
        L_0x0007:
            qfn r2 = a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r1] = r7
            java.lang.String r7 = "Unknown install update %d"
            r2.c(r7, r3)
            r7 = 0
            r2 = 0
            r3 = 0
            goto L_0x002a
        L_0x001a:
            r7 = 0
            r2 = 1
            goto L_0x0029
        L_0x001d:
            r7 = 2131954140(0x7f1309dc, float:1.954477E38)
            goto L_0x0028
        L_0x0021:
            r7 = 0
            r2 = 0
            r3 = 1
            goto L_0x002a
        L_0x0025:
            r7 = 2131954138(0x7f1309da, float:1.9544767E38)
        L_0x0028:
            r2 = 0
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r7 == 0) goto L_0x0040
            android.widget.TextView r4 = r6.h
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 2131954141(0x7f1309dd, float:1.9544773E38)
            java.lang.String r5 = r6.getString(r5)
            r0[r1] = r5
            java.lang.String r7 = r6.getString(r7, r0)
            r4.setText(r7)
        L_0x0040:
            if (r2 == 0) goto L_0x004e
            java.lang.String r7 = "InstallSupervisorFragment.Success"
            r6.a((java.lang.String) r7)
            qne r7 = r6.e
            if (r7 == 0) goto L_0x004e
            r7.f()
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r6.a()
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qme.a(int):void");
    }

    public final void a(String str) {
        qnf qnf = this.f;
        if (qnf != null) {
            qnf.a(str);
        }
    }
}
