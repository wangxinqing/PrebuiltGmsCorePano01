package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new euh();
    public final String a;
    public final String b;
    public final Uri c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List list2;
        Boolean bool;
        iva.a((Object) str, (Object) "credential identifier cannot be null");
        String trim = str.trim();
        iva.a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (TextUtils.isEmpty(str4)) {
                    bool = false;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                        bool = false;
                    } else {
                        if ("http".equalsIgnoreCase(parse.getScheme())) {
                            z = true;
                        } else if ("https".equalsIgnoreCase(parse.getScheme())) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.b = str2;
                this.c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.d = list2;
                this.a = trim;
                this.e = str3;
                this.f = str4;
                this.g = str5;
                this.h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public final int a() {
        int i = !amrk.a(this.b) ? 2 : 1;
        if (this.c != null) {
            i++;
        }
        if (!amrk.a(this.g)) {
            i++;
        }
        return !amrk.a(this.h) ? i + 1 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Credential) {
            Credential credential = (Credential) obj;
            return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && ius.a(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 9, this.g, false);
        ivx.a(parcel, 10, this.h, false);
        ivx.b(parcel, a2);
    }
}
