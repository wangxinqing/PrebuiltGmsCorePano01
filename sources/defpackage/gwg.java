package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: gwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class gwg extends X509Certificate {
    private final X509Certificate a;

    public gwg(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    public void checkValidity() {
        this.a.checkValidity();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        gwg gwg = (gwg) obj;
        X509Certificate x509Certificate = this.a;
        if (x509Certificate == null) {
            if (gwg.a != null) {
                return false;
            }
        } else if (!x509Certificate.equals(gwg.a)) {
            return false;
        }
        return true;
    }

    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    public final byte[] getEncoded() {
        return this.a.getEncoded();
    }

    public final List getExtendedKeyUsage() {
        return this.a.getExtendedKeyUsage();
    }

    public final byte[] getExtensionValue(String str) {
        return this.a.getExtensionValue(str);
    }

    public final Collection getIssuerAlternativeNames() {
        return this.a.getIssuerAlternativeNames();
    }

    public final Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    public final X500Principal getIssuerX500Principal() {
        return this.a.getIssuerX500Principal();
    }

    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.a.getSignature();
    }

    public final Collection getSubjectAlternativeNames() {
        return this.a.getSubjectAlternativeNames();
    }

    public final Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }

    public final X500Principal getSubjectX500Principal() {
        return this.a.getSubjectX500Principal();
    }

    public final byte[] getTBSCertificate() {
        return this.a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        X509Certificate x509Certificate = this.a;
        return hashCode + (x509Certificate != null ? x509Certificate.hashCode() : 0);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void verify(PublicKey publicKey) {
        this.a.verify(publicKey);
    }

    public void checkValidity(Date date) {
        this.a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.a.verify(publicKey, str);
    }
}
