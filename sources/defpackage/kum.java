package defpackage;

import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;

/* renamed from: kum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kum extends kuy {
    final /* synthetic */ jzy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kum(icc icc, jzy jzy) {
        super(icc);
        this.a = jzy;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new SetPinnedDownloadPreferencesRequest(new ParcelableTransferPreferences(this.a)), (kwg) new kxn(this));
    }
}
