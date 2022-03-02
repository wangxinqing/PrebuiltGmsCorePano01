package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.OpenSSLX509Certificate;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CertificateEntry {
    private final byte[] certificate;
    private final LogEntryType entryType;
    private final byte[] issuerKeyHash;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum LogEntryType {
        X509_ENTRY,
        PRECERT_ENTRY
    }

    private CertificateEntry(LogEntryType logEntryType, byte[] bArr, byte[] bArr2) {
        if (logEntryType == LogEntryType.PRECERT_ENTRY && bArr2 == null) {
            throw new IllegalArgumentException("issuerKeyHash missing for precert entry.");
        } else if (logEntryType == LogEntryType.X509_ENTRY && bArr2 != null) {
            throw new IllegalArgumentException("unexpected issuerKeyHash for X509 entry.");
        } else if (bArr2 == null || bArr2.length == 32) {
            this.entryType = logEntryType;
            this.issuerKeyHash = bArr2;
            this.certificate = bArr;
        } else {
            throw new IllegalArgumentException("issuerKeyHash must be 32 bytes long");
        }
    }

    public static CertificateEntry createForPrecertificate(OpenSSLX509Certificate openSSLX509Certificate, OpenSSLX509Certificate openSSLX509Certificate2) {
        try {
            if (openSSLX509Certificate.getNonCriticalExtensionOIDs().contains(CTConstants.X509_SCT_LIST_OID)) {
                byte[] tBSCertificate = openSSLX509Certificate.withDeletedExtension(CTConstants.X509_SCT_LIST_OID).getTBSCertificate();
                byte[] encoded = openSSLX509Certificate2.getPublicKey().getEncoded();
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(encoded);
                return createForPrecertificate(tBSCertificate, instance.digest());
            }
            throw new CertificateException("Certificate does not contain embedded signed timestamps");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static CertificateEntry createForX509Certificate(X509Certificate x509Certificate) {
        return createForX509Certificate(x509Certificate.getEncoded());
    }

    public void encode(OutputStream outputStream) {
        Serialization.writeNumber(outputStream, (long) this.entryType.ordinal(), 2);
        if (this.entryType == LogEntryType.PRECERT_ENTRY) {
            Serialization.writeFixedBytes(outputStream, this.issuerKeyHash);
        }
        Serialization.writeVariableBytes(outputStream, this.certificate, 3);
    }

    public byte[] getCertificate() {
        return this.certificate;
    }

    public LogEntryType getEntryType() {
        return this.entryType;
    }

    public byte[] getIssuerKeyHash() {
        return this.issuerKeyHash;
    }

    public static CertificateEntry createForX509Certificate(byte[] bArr) {
        return new CertificateEntry(LogEntryType.X509_ENTRY, bArr, (byte[]) null);
    }

    public static CertificateEntry createForPrecertificate(byte[] bArr, byte[] bArr2) {
        return new CertificateEntry(LogEntryType.PRECERT_ENTRY, bArr, bArr2);
    }
}
