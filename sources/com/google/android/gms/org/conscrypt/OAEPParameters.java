package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map NAME_TO_OID = new HashMap();
    private static final Map OID_TO_NAME = new HashMap();
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    static {
        OID_TO_NAME.put("1.3.14.3.2.26", "SHA-1");
        OID_TO_NAME.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        OID_TO_NAME.put("2.16.840.1.101.3.4.2.1", "SHA-256");
        OID_TO_NAME.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        OID_TO_NAME.put("2.16.840.1.101.3.4.2.3", "SHA-512");
        for (Map.Entry entry : OID_TO_NAME.entrySet()) {
            NAME_TO_OID.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    private static String getHashName(long j) {
        long j2;
        try {
            j2 = NativeCrypto.asn1_read_sequence(j);
            try {
                String asn1_read_oid = NativeCrypto.asn1_read_oid(j2);
                if (!NativeCrypto.asn1_read_is_empty(j2)) {
                    NativeCrypto.asn1_read_null(j2);
                }
                if (!NativeCrypto.asn1_read_is_empty(j2) || !OID_TO_NAME.containsKey(asn1_read_oid)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                String str = (String) OID_TO_NAME.get(asn1_read_oid);
                NativeCrypto.asn1_read_free(j2);
                return str;
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = 0;
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    static String readHash(long j) {
        long j2;
        if (!NativeCrypto.asn1_read_next_tag_is(j, 0)) {
            return "SHA-1";
        }
        try {
            j2 = NativeCrypto.asn1_read_tagged(j);
            try {
                String hashName = getHashName(j2);
                NativeCrypto.asn1_read_free(j2);
                return hashName;
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = 0;
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    static String readMgfHash(long j) {
        long j2;
        if (!NativeCrypto.asn1_read_next_tag_is(j, 1)) {
            return "SHA-1";
        }
        long j3 = 0;
        try {
            j2 = NativeCrypto.asn1_read_tagged(j);
            try {
                j3 = NativeCrypto.asn1_read_sequence(j2);
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(j3);
                NativeCrypto.asn1_read_free(j2);
                throw th;
            }
            try {
                if (NativeCrypto.asn1_read_oid(j3).equals(MGF1_OID)) {
                    String hashName = getHashName(j3);
                    if (NativeCrypto.asn1_read_is_empty(j3)) {
                        NativeCrypto.asn1_read_free(j3);
                        NativeCrypto.asn1_read_free(j2);
                        return hashName;
                    }
                    throw new IOException("Error reading ASN.1 encoding");
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_read_free(j3);
                NativeCrypto.asn1_read_free(j2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = 0;
            NativeCrypto.asn1_read_free(j3);
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    private static long writeAlgorithmIdentifier(long j, String str) {
        long j2;
        try {
            j2 = NativeCrypto.asn1_write_sequence(j);
            try {
                NativeCrypto.asn1_write_oid(j2, str);
                return j2;
            } catch (IOException e) {
                e = e;
                NativeCrypto.asn1_write_free(j2);
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            j2 = 0;
            NativeCrypto.asn1_write_free(j2);
            throw e;
        }
    }

    static void writeHashAndMgfHash(long j, String str, MGF1ParameterSpec mGF1ParameterSpec) {
        long j2;
        long j3;
        long j4;
        long writeAlgorithmIdentifier;
        long j5 = 0;
        if (!str.equals("SHA-1")) {
            try {
                j4 = NativeCrypto.asn1_write_tag(j, 0);
                try {
                    writeAlgorithmIdentifier = writeAlgorithmIdentifier(j4, (String) NAME_TO_OID.get(str));
                } catch (Throwable th) {
                    th = th;
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j4);
                    throw th;
                }
                try {
                    NativeCrypto.asn1_write_null(writeAlgorithmIdentifier);
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(writeAlgorithmIdentifier);
                    NativeCrypto.asn1_write_free(j4);
                } catch (Throwable th2) {
                    th = th2;
                    j5 = writeAlgorithmIdentifier;
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j4);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j4 = 0;
                NativeCrypto.asn1_write_flush(j);
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j4);
                throw th;
            }
        }
        if (!mGF1ParameterSpec.getDigestAlgorithm().equals("SHA-1")) {
            try {
                j3 = NativeCrypto.asn1_write_tag(j, 1);
                try {
                    j2 = writeAlgorithmIdentifier(j3, MGF1_OID);
                    try {
                        j5 = writeAlgorithmIdentifier(j2, (String) NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
                        NativeCrypto.asn1_write_null(j5);
                        NativeCrypto.asn1_write_flush(j);
                        NativeCrypto.asn1_write_free(j5);
                        NativeCrypto.asn1_write_free(j2);
                        NativeCrypto.asn1_write_free(j3);
                    } catch (Throwable th4) {
                        th = th4;
                        NativeCrypto.asn1_write_flush(j);
                        NativeCrypto.asn1_write_free(j5);
                        NativeCrypto.asn1_write_free(j2);
                        NativeCrypto.asn1_write_free(j3);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j2 = 0;
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j2);
                    NativeCrypto.asn1_write_free(j3);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                j3 = 0;
                j2 = 0;
                NativeCrypto.asn1_write_flush(j);
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j2);
                NativeCrypto.asn1_write_free(j3);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        Throwable th;
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = 0;
        try {
            j = NativeCrypto.asn1_write_init();
            try {
                j2 = NativeCrypto.asn1_write_sequence(j);
            } catch (IOException e) {
                j3 = j;
                e = e;
                j2 = 0;
                j5 = j3;
                try {
                    NativeCrypto.asn1_write_cleanup(j5);
                    throw e;
                } catch (Throwable th2) {
                    long j6 = j2;
                    th = th2;
                    j = j5;
                    j5 = j6;
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
            try {
                writeHashAndMgfHash(j2, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                if (pSpecified.getValue().length != 0) {
                    try {
                        j4 = NativeCrypto.asn1_write_tag(j2, 2);
                        try {
                            j5 = writeAlgorithmIdentifier(j4, PSPECIFIED_OID);
                            NativeCrypto.asn1_write_octetstring(j5, pSpecified.getValue());
                            NativeCrypto.asn1_write_flush(j2);
                            NativeCrypto.asn1_write_free(j5);
                            NativeCrypto.asn1_write_free(j4);
                        } catch (Throwable th4) {
                            th = th4;
                            NativeCrypto.asn1_write_flush(j2);
                            NativeCrypto.asn1_write_free(j5);
                            NativeCrypto.asn1_write_free(j4);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j4 = 0;
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j5);
                        NativeCrypto.asn1_write_free(j4);
                        throw th;
                    }
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j2);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e2) {
                j3 = j;
                e = e2;
                j5 = j3;
                NativeCrypto.asn1_write_cleanup(j5);
                throw e;
            } catch (Throwable th6) {
                long j7 = j2;
                th = th6;
                j5 = j7;
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            j2 = 0;
            NativeCrypto.asn1_write_cleanup(j5);
            throw e;
        } catch (Throwable th7) {
            th = th7;
            j = 0;
            NativeCrypto.asn1_write_free(j5);
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null && cls == OAEPParameterSpec.class) {
            return this.spec;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unsupported class: ");
        sb.append(valueOf);
        throw new InvalidParameterSpecException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            this.spec = (OAEPParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "Conscrypt OAEP AlgorithmParameters";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0080=Splitter:B:39:0x0080, B:27:0x0068=Splitter:B:27:0x0068} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(byte[] r13) {
        /*
            r12 = this;
            r0 = 0
            long r2 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_init(r13)     // Catch:{ all -> 0x008c }
            long r4 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_sequence(r2)     // Catch:{ all -> 0x008a }
            javax.crypto.spec.PSource$PSpecified r13 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = readHash(r4)     // Catch:{ all -> 0x0087 }
            java.lang.String r7 = readMgfHash(r4)     // Catch:{ all -> 0x0087 }
            r8 = 2
            boolean r8 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_next_tag_is(r4, r8)     // Catch:{ all -> 0x0087 }
            java.lang.String r9 = "Error reading ASN.1 encoding"
            if (r8 != 0) goto L_0x001e
            goto L_0x0047
        L_0x001e:
            long r10 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_tagged(r4)     // Catch:{ all -> 0x007e }
            long r0 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_sequence(r10)     // Catch:{ all -> 0x007c }
            java.lang.String r13 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_oid(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "1.2.840.113549.1.1.9"
            boolean r13 = r13.equals(r8)     // Catch:{ all -> 0x007a }
            if (r13 == 0) goto L_0x0074
            javax.crypto.spec.PSource$PSpecified r13 = new javax.crypto.spec.PSource$PSpecified     // Catch:{ all -> 0x007a }
            byte[] r8 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_octetstring(r0)     // Catch:{ all -> 0x007a }
            r13.<init>(r8)     // Catch:{ all -> 0x007a }
            boolean r8 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_is_empty(r0)     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x006e
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r0)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r10)     // Catch:{ all -> 0x0087 }
        L_0x0047:
            boolean r0 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_is_empty(r4)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0068
            boolean r0 = com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_is_empty(r2)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0068
            javax.crypto.spec.OAEPParameterSpec r0 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "MGF1"
            java.security.spec.MGF1ParameterSpec r8 = new java.security.spec.MGF1ParameterSpec     // Catch:{ all -> 0x0087 }
            r8.<init>(r7)     // Catch:{ all -> 0x0087 }
            r0.<init>(r6, r1, r8, r13)     // Catch:{ all -> 0x0087 }
            r12.spec = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r4)
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r2)
            return
        L_0x0068:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0087 }
            r13.<init>(r9)     // Catch:{ all -> 0x0087 }
            throw r13     // Catch:{ all -> 0x0087 }
        L_0x006e:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x007a }
            r13.<init>(r9)     // Catch:{ all -> 0x007a }
            throw r13     // Catch:{ all -> 0x007a }
        L_0x0074:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x007a }
            r13.<init>(r9)     // Catch:{ all -> 0x007a }
            throw r13     // Catch:{ all -> 0x007a }
        L_0x007a:
            r13 = move-exception
            goto L_0x0080
        L_0x007c:
            r13 = move-exception
            goto L_0x0080
        L_0x007e:
            r13 = move-exception
            r10 = r0
        L_0x0080:
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r0)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r10)     // Catch:{ all -> 0x0087 }
            throw r13     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r13 = move-exception
            r0 = r4
            goto L_0x008e
        L_0x008a:
            r13 = move-exception
            goto L_0x008e
        L_0x008c:
            r13 = move-exception
            r2 = r0
        L_0x008e:
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r0)
            com.google.android.gms.org.conscrypt.NativeCrypto.asn1_read_free(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.OAEPParameters.engineInit(byte[]):void");
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
            return;
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }
}
