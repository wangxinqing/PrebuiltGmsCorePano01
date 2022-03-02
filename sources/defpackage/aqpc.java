package defpackage;

/* renamed from: aqpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqpc implements auco {
    PASSPHRASE_TYPE_UNSPECIFIED(0),
    IMPLICIT_PASSPHRASE(1),
    KEYSTORE_PASSPHRASE(2),
    FROZEN_IMPLICIT_PASSPHRASE(3),
    CUSTOM_PASSPHRASE(4),
    TRUSTED_VAULT_PASSPHRASE(5),
    UNRECOGNIZED(-1);
    
    private final int h;

    private aqpc(int i2) {
        this.h = i2;
    }

    public static aqpc a(int i2) {
        if (i2 == 0) {
            return PASSPHRASE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return IMPLICIT_PASSPHRASE;
        }
        if (i2 == 2) {
            return KEYSTORE_PASSPHRASE;
        }
        if (i2 == 3) {
            return FROZEN_IMPLICIT_PASSPHRASE;
        }
        if (i2 == 4) {
            return CUSTOM_PASSPHRASE;
        }
        if (i2 != 5) {
            return null;
        }
        return TRUSTED_VAULT_PASSPHRASE;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
