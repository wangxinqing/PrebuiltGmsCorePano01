package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: aclm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aclm extends Fragment {
    public static final iwd a = acqa.a("Setup", "UI", "D2DConnectionFragment");
    public final acll b = new acll();
    public abqf c;
    public D2DDevice d;
    public int e;
    public String f;
    public BootstrapOptions g;
    public final abpw h = new acky(this);
    public final abpu i = new ackz(this);
    public final abst j = new acla(this);

    public final void a() {
        a.a(String.format("Connecting to target: %s", new Object[]{this.d.c}), new Object[0]);
        if (azky.d()) {
            this.c.a(new ConnectionRequest(this.d, this.f, (String) null, (byte[]) null, (String) null, this.e), this.h).a((acvs) new acks(this));
            return;
        }
        abqf abqf = this.c;
        D2DDevice d2DDevice = this.d;
        String str = this.f;
        abpw abpw = this.h;
        iha b2 = ihb.b();
        b2.a = new abyp(abqf, d2DDevice, str, abpw);
        acwa b3 = abqf.b(b2.a());
        b3.a((acvv) new abyq(abqf));
        b3.a((acvs) new ackt(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        a.a("onDestroy", new Object[0]);
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        this.b.a((aclb) null);
    }

    public final void onResume() {
        super.onResume();
        try {
            this.b.a((aclb) getActivity());
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Containing activity must implement D2DConnectionFragment.Listener", e2);
        }
    }

    public final void a(Bundle bundle) {
        abqf abqf = this.c;
        iha b2 = ihb.b();
        b2.a = new abyu(bundle);
        abqf.b(b2.a());
    }
}
