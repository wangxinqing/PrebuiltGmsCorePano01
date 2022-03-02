package com.google.android.location.reporting.state.update;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ReportingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajnf();
    public final List a;
    public final Conditions b;

    public ReportingConfig(List list, Conditions conditions) {
        this.a = Collections.unmodifiableList(list);
        iva.a((Object) conditions, (Object) "conditions");
        this.b = conditions;
    }

    public final AccountConfig a(Account account) {
        for (AccountConfig accountConfig : this.a) {
            if (accountConfig.a.equals(account)) {
                return accountConfig;
            }
        }
        return null;
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (AccountConfig accountConfig : this.a) {
            if (accountConfig.j()) {
                arrayList.add(accountConfig.a);
            }
        }
        return arrayList;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (AccountConfig accountConfig : this.a) {
            if (accountConfig.j()) {
                arrayList.add(accountConfig);
            }
        }
        return arrayList;
    }

    public final boolean d() {
        return !b().isEmpty();
    }

    public final String e() {
        nz nzVar = new nz();
        for (AccountConfig accountConfig : this.a) {
            nzVar.put(accountConfig.a, accountConfig.e());
        }
        Map unmodifiableMap = Collections.unmodifiableMap(nzVar);
        if (unmodifiableMap.isEmpty()) {
            return "(no Google accounts)";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            linkedHashMap.put(rmp.a((Account) entry.getKey()), entry.getValue());
        }
        return linkedHashMap.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportingConfig) {
            ReportingConfig reportingConfig = (ReportingConfig) obj;
            return this.a.equals(reportingConfig.a) && this.b.equals(reportingConfig.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("ReportingConfig{, mAccountConfigs=");
        sb.append(valueOf);
        sb.append(", mConditions=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public final Set a() {
        ob obVar = new ob();
        for (AccountConfig accountConfig : this.a) {
            obVar.add(accountConfig.a);
        }
        return obVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
