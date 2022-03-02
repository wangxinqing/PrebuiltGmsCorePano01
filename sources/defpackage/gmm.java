package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.frp.FrpSnapshot;

/* renamed from: gmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmm {
    public Boolean a = null;
    public Boolean b = null;
    public FrpSnapshot c = null;
    public boolean d = false;
    public Long e = null;
    public boolean f = false;
    public volatile boolean g = false;
    private final Runnable h;

    public gmm(Bundle bundle, Runnable runnable) {
        boolean z;
        byte[] byteArray;
        amrl.a((Object) runnable);
        this.h = runnable;
        if (bundle == null || !bundle.getBoolean("state.is_challenge_started", false)) {
            z = false;
        } else {
            z = true;
        }
        this.g = z;
        if (bundle != null) {
            if (bundle.containsKey("state.create_time")) {
                this.e = Long.valueOf(bundle.getLong("state.create_time"));
            }
            if (bundle.containsKey("state.checkin_result")) {
                this.a = Boolean.valueOf(bundle.getBoolean("state.checkin_result", false));
            }
            if (bundle.containsKey("state.challenge_result")) {
                this.b = Boolean.valueOf(bundle.getBoolean("state.challenge_result", false));
            }
            if (bundle.containsKey("state.frp_snapshot") && (byteArray = bundle.getByteArray("state.frp_snapshot")) != null) {
                this.c = (FrpSnapshot) ivy.a(byteArray, FrpSnapshot.CREATOR);
            }
            this.d = bundle.getBoolean("state.is_fre_unlocked", false);
            this.f = bundle.getBoolean("state.phenotype_sync", false);
        }
    }

    public final void a() {
        this.f = true;
        b();
    }

    public final void b() {
        if (this.d || (this.a != null && this.b != null && this.c != null && this.f)) {
            this.h.run();
        }
    }

    public final void a(FrpSnapshot frpSnapshot) {
        this.c = frpSnapshot;
        b();
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
        b();
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
        b();
    }
}
