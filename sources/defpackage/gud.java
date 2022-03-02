package defpackage;

import android.os.RemoteException;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: gud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gud extends guf {
    final /* synthetic */ ige a;
    final /* synthetic */ gth b;
    final /* synthetic */ BleSettings c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gud(icc icc, ige ige, gth gth, BleSettings bleSettings) {
        super(icc);
        this.a = ige;
        this.b = gth;
        this.c = bleSettings;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        gui gui = (gui) ibf;
        ige ige = this.a;
        gth gth = this.b;
        try {
            gui.k().a(new igt(this), gui.a.a(ige, gth), this.c);
        } catch (RemoteException e) {
            gui.a.a(gth);
            throw e;
        }
    }
}
