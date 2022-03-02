package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: acdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdr extends Fragment {
    public static final iwd a = acqa.a("D2D", "UI", "TargetResourcesFragment");
    public abty b = null;
    public boolean c;
    public String d;
    public Bundle e;
    public int f = 1;
    public final accv g = new accv(Looper.getMainLooper());
    public boolean h = false;
    public final acac i = new acac();
    public boolean j;
    public acki k;
    public jje l;
    public final long m = acpy.a();
    private Bundle n;
    private final abtb o = new acdo(this);

    public final void a() {
        b();
        this.i.a(13);
        this.g.b(112, Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.b != null) {
            this.c = false;
            a.a("Disabling target mode.", new Object[0]);
            abty abty = this.b;
            abty.a("target_nearby_api");
            iha b2 = ihb.b();
            b2.a = abts.a;
            abty.b(b2.a()).a(acdn.a);
            return;
        }
        a.f("Invalid connectionless client state.", new Object[0]);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.n = bundle;
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 3) {
            this.k.a(3, i3);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.l != null) {
            new qvr(Looper.getMainLooper()).post(new acdq(this, activity));
        }
        this.k = new acki(activity, (aclo) null, this.n);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            a.b("Activity was destroyed. Unable to recover state", new Object[0]);
        } else {
            a(getActivity());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        b();
    }

    public final void onPause() {
        super.onPause();
        this.k.b();
    }

    public final void onResume() {
        super.onResume();
        this.k.a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.k.a(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.g.a((accj) getActivity());
    }

    public final void onStop() {
        super.onStop();
        this.g.a((accj) null);
    }

    public final void a(Context context) {
        long j2;
        long j3;
        if (!this.c) {
            this.b = abmr.a(context);
            TargetChimeraActivity targetChimeraActivity = (TargetChimeraActivity) getActivity();
            boolean z = false;
            if (targetChimeraActivity != null && targetChimeraActivity.h()) {
                z = true;
            }
            aboc aboc = new aboc();
            aboc.a = 1;
            aboc.b = !z ? 4 : 5;
            aboc.g = azlf.a.a().K();
            aboc.h = this.m;
            aboc.j = azlf.a.a().h();
            aboc.i = azlf.l();
            abpi abpi = new abpi();
            abpi.a(1, azlf.a.a().e());
            abpi.a(3, true);
            abpi.a(5, azkf.e());
            abpi.a(8, z);
            abpi.a(9, z);
            aboc.k = abpi;
            if (azjh.f() && targetChimeraActivity != null) {
                abnf abnf = new abnf();
                abnf.a = acbr.a(targetChimeraActivity.getApplicationContext()).g;
                aboc.l = abnf.a();
            }
            abpi abpi2 = aboc.k;
            if (abpi2 != null) {
                j3 = abpi2.a;
                j2 = abpi2.b;
            } else {
                j3 = 0;
                j2 = 0;
            }
            BootstrapOptions bootstrapOptions = new BootstrapOptions(aboc.a, aboc.b, false, aboc.d, (byte) 0, aboc.f, (CompanionApp) null, aboc.g, aboc.h, aboc.i, aboc.j, j3, hxj.b, j2, (PostTransferAction) null, aboc.l);
            abty abty = this.b;
            abtb abtb = this.o;
            iha b2 = ihb.b();
            b2.a = new abto(abty, bootstrapOptions, abtb);
            acwa b3 = abty.b(b2.a());
            b3.a((acvv) new abtr(abty));
            b3.a((acvs) new acdh(this));
            b3.a((acvv) new acdi(this));
            b3.a(acdj.a);
            acwa b4 = b3.b(new acdk(this));
            b4.a((acvv) new acdl(this));
            b4.a(acdm.a);
        }
    }
}
