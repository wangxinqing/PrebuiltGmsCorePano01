package com.google.android.gms.org.conscrypt.ct;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VerifiedSCT {
    public final SignedCertificateTimestamp sct;
    public final Status status;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    public VerifiedSCT(SignedCertificateTimestamp signedCertificateTimestamp, Status status2) {
        this.sct = signedCertificateTimestamp;
        this.status = status2;
    }
}
