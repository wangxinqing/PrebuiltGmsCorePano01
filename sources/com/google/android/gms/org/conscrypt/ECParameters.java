package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ECParameters extends AlgorithmParametersSpi {
    private OpenSSLECGroupContext curve;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        return NativeCrypto.EC_KEY_marshal_curve_name(this.curve.getNativeRef());
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == ECParameterSpec.class) {
            return this.curve.getECParameterSpec();
        }
        if (cls == ECGenParameterSpec.class) {
            return new ECGenParameterSpec(Platform.getCurveName(this.curve.getECParameterSpec()));
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unsupported class: ");
        sb.append(valueOf);
        throw new InvalidParameterSpecException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(name);
            if (curveByName == null) {
                String valueOf = String.valueOf(name);
                throw new InvalidParameterSpecException(valueOf.length() == 0 ? new String("Unknown EC curve name: ") : "Unknown EC curve name: ".concat(valueOf));
            } else {
                this.curve = curveByName;
            }
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            try {
                OpenSSLECGroupContext instance = OpenSSLECGroupContext.getInstance(eCParameterSpec);
                if (instance != null) {
                    this.curve = instance;
                    return;
                }
                String valueOf2 = String.valueOf(eCParameterSpec);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                sb.append("Unknown EC curve: ");
                sb.append(valueOf2);
                throw new InvalidParameterSpecException(sb.toString());
            } catch (InvalidAlgorithmParameterException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        } else {
            throw new InvalidParameterSpecException("Only ECParameterSpec and ECGenParameterSpec are supported");
        }
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "Conscrypt EC AlgorithmParameters";
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) {
        long EC_KEY_parse_curve_name = NativeCrypto.EC_KEY_parse_curve_name(bArr);
        if (EC_KEY_parse_curve_name != 0) {
            this.curve = new OpenSSLECGroupContext(new NativeRef.EC_GROUP(EC_KEY_parse_curve_name));
            return;
        }
        throw new IOException("Error reading ASN.1 encoding");
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
