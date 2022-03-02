package com.google.android.gms.nearby.sharing;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalReceiveSurfaceChimeraActivity extends ReceiveSurfaceChimeraActivity {
    public final void onCreate(Bundle bundle) {
        ShareTarget shareTarget;
        TransferMetadata transferMetadata;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("share_target_bytes");
        if (byteArrayExtra != null) {
            try {
                shareTarget = (ShareTarget) wib.a(byteArrayExtra, ShareTarget.CREATOR);
            } catch (IllegalArgumentException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                anih.a("Received unexpected intent with invalid share target");
                shareTarget = null;
            }
        } else {
            shareTarget = null;
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("transfer_metadata_bytes");
        if (byteArrayExtra2 != null) {
            try {
                transferMetadata = (TransferMetadata) wib.a(byteArrayExtra2, TransferMetadata.CREATOR);
            } catch (IllegalArgumentException e2) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e2);
                anih2.a("Received unexpected intent with invalid TransferMetadata");
                transferMetadata = null;
            }
        } else {
            transferMetadata = null;
        }
        if (shareTarget != null && transferMetadata != null) {
            i();
            if (!this.m) {
                this.i.setText((CharSequence) null);
                super.b(shareTarget, transferMetadata);
            }
        }
    }
}
