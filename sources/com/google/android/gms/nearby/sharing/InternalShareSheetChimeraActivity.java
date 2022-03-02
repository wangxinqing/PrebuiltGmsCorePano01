package com.google.android.gms.nearby.sharing;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalShareSheetChimeraActivity extends ShareSheetChimeraActivity {
    public final void onCreate(Bundle bundle) {
        ShareTarget shareTarget;
        ShareTarget shareTarget2;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("direct_share_target_bytes");
        TransferMetadata transferMetadata = null;
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
        if (shareTarget != null) {
            this.n = shareTarget;
            this.m = shareTarget;
            this.h.a(shareTarget);
            super.e(shareTarget);
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("share_target_bytes");
        if (byteArrayExtra2 != null) {
            try {
                shareTarget2 = (ShareTarget) wib.a(byteArrayExtra2, ShareTarget.CREATOR);
            } catch (IllegalArgumentException e2) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e2);
                anih2.a("Received unexpected intent with invalid share target");
                shareTarget2 = null;
            }
        } else {
            shareTarget2 = null;
        }
        byte[] byteArrayExtra3 = getIntent().getByteArrayExtra("transfer_metadata_bytes");
        if (byteArrayExtra3 != null) {
            try {
                transferMetadata = (TransferMetadata) wib.a(byteArrayExtra3, TransferMetadata.CREATOR);
            } catch (IllegalArgumentException e3) {
                anih anih3 = (anih) vvj.a.c();
                anih3.a((Throwable) e3);
                anih3.a("Received unexpected intent with invalid TransferMetadata");
            }
        }
        if (shareTarget2 != null && transferMetadata != null) {
            b(shareTarget2, transferMetadata);
        }
    }
}
