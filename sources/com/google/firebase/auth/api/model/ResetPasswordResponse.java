package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResetPasswordResponse extends AbstractSafeParcelable implements apth {
    public static final Parcelable.Creator CREATOR = new apuu();
    public String a;
    public String b;
    public String c;
    public MfaInfo d;

    public ResetPasswordResponse() {
    }

    public final auef a() {
        return (auef) almm.f.c(7);
    }

    public ResetPasswordResponse(String str, String str2, String str3, MfaInfo mfaInfo) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mfaInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.b(parcel, a2);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        String str;
        if (audx instanceof almm) {
            almm almm = (almm) audx;
            this.a = jlh.b(almm.b);
            this.b = jlh.b(almm.c);
            aqkx a2 = aqkx.a(almm.d);
            if (a2 == null) {
                a2 = aqkx.OOB_REQ_TYPE_UNSPECIFIED;
            }
            int ordinal = a2.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        str = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str = "VERIFY_BEFORE_UPDATE_EMAIL";
                        break;
                    case 8:
                        str = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                str = "PASSWORD_RESET";
            }
            this.c = str;
            if ((almm.a & 16) != 0) {
                alnh alnh = almm.e;
                if (alnh == null) {
                    alnh = alnh.h;
                }
                this.d = MfaInfo.a(alnh);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of ResetPasswordResponse.");
    }
}
