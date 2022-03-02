package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.AccountMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: wok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wok extends wnc {
    private static final Set y = new HashSet();
    private int A;
    private final boolean b;
    private final String c;
    private final String d;
    private final int e;
    private final woj f;
    private amsn g;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private boolean x;
    private int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wok(String str, int i, wzv wzv, boolean z2, boolean z3, String str2, String str3, int i2) {
        super(str, i, wzv, str2, "LoadOwners");
        if (woj.a == null) {
            woj.a = new woj();
        }
        woj woj = woj.a;
        this.z = 1;
        this.A = 1;
        xip.a();
        this.b = z2;
        this.x = z3;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = woj;
        xip.a();
        this.u = ((Boolean) xgy.a.a()).booleanValue();
        boolean booleanValue = ((Boolean) xgz.a.a()).booleanValue();
        this.v = booleanValue;
        woj.d = booleanValue;
        this.t = ((Boolean) xgx.a.a()).booleanValue();
        this.s = Boolean.valueOf(aywy.a.a().as()).booleanValue();
        this.w = ((Boolean) xgw.a.a()).booleanValue();
        if (this.s) {
            amsn amsn = this.g;
            this.g = amsn == null ? amsn.b(ampt.a) : amsn;
        }
    }

    private final DataHolder a(Context context, boolean z2, String str, String str2, int i) {
        DataHolder dataHolder;
        String str3;
        String str4;
        Context context2 = context;
        int i2 = i;
        long a = this.s ? this.g.a(TimeUnit.MICROSECONDS) : 0;
        woj woj = this.f;
        Bundle bundle = new Bundle();
        xej a2 = xej.a(context);
        Bundle bundle2 = new Bundle();
        anhj a3 = woj.b.d(context2).iterator();
        while (a3.hasNext()) {
            Account account = (Account) a3.next();
            if (woj.d) {
                woj.e.add(account.name);
            }
            AccountMetadata accountMetadata = new AccountMetadata();
            if (!aywd.a.a().a()) {
                accountMetadata.a = woj.c.a(context2, account);
            }
            accountMetadata.b = a2.b(account.name, (String) null);
            accountMetadata.c = a2.c(account.name, "pageid");
            accountMetadata.d = a2.b(account.name, "pageid");
            bundle2.putParcelable(account.name, accountMetadata);
        }
        bundle.putParcelable("account_metadata", bundle2);
        wtx b2 = wtz.a(context).b();
        if (b2 == null) {
            dataHolder = DataHolder.a(new String[0]).a(13);
        } else {
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder(70);
                sb.append("account_name,(page_gaia_id IS NOT NULL),display_name COLLATE LOCALIZED");
                str3 = sb.toString();
            } else if (i2 == 1) {
                StringBuilder sb2 = new StringBuilder(151);
                sb2.append("(SELECT _id FROM owners WHERE account_name=leftOwners.account_name AND page_gaia_id IS NULL) ,(page_gaia_id IS NOT NULL),display_name COLLATE LOCALIZED");
                str3 = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(53);
                sb3.append("Value of sortOrder isn't valid.sortOrder= ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
            String valueOf = String.valueOf(str3);
            String str5 = valueOf.length() == 0 ? new String("SELECT _id,account_name,display_name,given_name,family_name,gaia_id,page_gaia_id,avatar,cover_photo_url,cover_photo_height,cover_photo_width,cover_photo_id,last_sync_start_time,last_sync_finish_time,last_sync_status,last_successful_sync_time,sync_circles_to_contacts as sync_to_contacts,sync_circles_to_contacts,sync_evergreen_to_contacts,sync_me_to_contacts,is_dasher,dasher_domain FROM owners leftOwners  WHERE ((?2='') OR (account_name=?2 AND (((?3 = '') AND (page_gaia_id IS NULL)) OR (?3=page_gaia_id)))) AND ( ?1 OR (page_gaia_id IS NULL)) ORDER BY ") : "SELECT _id,account_name,display_name,given_name,family_name,gaia_id,page_gaia_id,avatar,cover_photo_url,cover_photo_height,cover_photo_width,cover_photo_id,last_sync_start_time,last_sync_finish_time,last_sync_status,last_successful_sync_time,sync_circles_to_contacts as sync_to_contacts,sync_circles_to_contacts,sync_evergreen_to_contacts,sync_me_to_contacts,is_dasher,dasher_domain FROM owners leftOwners  WHERE ((?2='') OR (account_name=?2 AND (((?3 = '') AND (page_gaia_id IS NULL)) OR (?3=page_gaia_id)))) AND ( ?1 OR (page_gaia_id IS NULL)) ORDER BY ".concat(valueOf);
            String[] strArr = new String[3];
            if (!z2) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            strArr[0] = str4;
            strArr[1] = ycm.b(str);
            strArr[2] = ycm.b(str2);
            dataHolder = new DataHolder(b2.a(str5, strArr), bundle);
        }
        if (this.s) {
            this.a.a(wml.b(3, this.g.a(TimeUnit.MICROSECONDS) - a));
        }
        if (dataHolder.h != 0) {
            if (this.t) {
                this.z = 4;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = dataHolder.h;
            aoru a4 = aosd.a((ExecutorService) jfb.a(i3, 9));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int a5 = dataHolder.a(i6);
                String c2 = dataHolder.c("account_name", i6, a5);
                String c3 = dataHolder.c("gaia_id", i6, a5);
                if (this.v) {
                    y.add(c2);
                }
                if (a(c3, c2)) {
                    arrayList.add(a4.b(new woi(c2, context2)));
                }
                if (this.u) {
                    if (!TextUtils.isEmpty(dataHolder.c("avatar", i6, a5))) {
                        i4++;
                    }
                    if (!TextUtils.isEmpty(dataHolder.c("cover_photo_url", i6, a5))) {
                        i5++;
                    }
                }
            }
            if (this.u) {
                wmi wmi = this.a;
                wmi.k = i4;
                wmi.l = i5;
            }
            HashMap hashMap = new HashMap();
            try {
                for (oq oqVar : (List) aorl.a((Iterable) arrayList).get()) {
                    hashMap.put((String) oqVar.a, (String) oqVar.b);
                }
                if (this.t) {
                    this.A = 2;
                }
            } catch (Exception e2) {
                if (this.t) {
                    this.A = 3;
                }
                Log.e("BasePeopleOperation", "Failed to query account Id: ", e2);
                if (Boolean.valueOf(aywy.a.a().bm()).booleanValue()) {
                    yde.a.a(context2).a(e2, Double.valueOf(aywy.a.a().bn()).doubleValue());
                }
            }
            int i7 = dataHolder.h;
            xip.a();
            boolean booleanValue = ((Boolean) xgv.a.a()).booleanValue();
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int a6 = dataHolder.a(i10);
                String c4 = dataHolder.c("account_name", i10, a6);
                if (a(dataHolder.c("gaia_id", i10, a6), c4)) {
                    if (booleanValue) {
                        i8++;
                    }
                    if (hashMap.containsKey(c4)) {
                        dataHolder.a("gaia_id", i10);
                        dataHolder.d[a6].putString((String) hashMap.get(c4), i10, dataHolder.c.getInt("gaia_id"));
                        if (booleanValue) {
                            i9++;
                        }
                    }
                }
            }
            if (booleanValue) {
                wmi wmi2 = this.a;
                wmi2.m = i8;
                wmi2.n = i9;
            }
        } else if (this.t) {
            this.z = 3;
        }
        if (this.t) {
            wmi wmi3 = this.a;
            int i11 = this.A;
            int i12 = this.z;
            wmi3.s = i11;
            wmi3.t = i12;
        }
        if (this.s) {
            this.a.a(wml.b(2, this.g.a(TimeUnit.MICROSECONDS)));
            this.g.e();
        }
        if (this.v) {
            Set set = this.f.e;
            int size = set.size();
            HashSet hashSet = new HashSet(set);
            HashSet hashSet2 = new HashSet(y);
            hashSet2.addAll(set);
            hashSet.retainAll(y);
            hashSet2.removeAll(hashSet);
            wmi wmi4 = this.a;
            int size2 = hashSet2.size();
            wmi4.o = size;
            wmi4.p = size2;
        }
        return dataHolder;
    }

    public final DataHolder d(Context context) {
        DataHolder dataHolder;
        int i;
        xip.a();
        if (Boolean.valueOf(aywy.a.a().aV()).booleanValue()) {
            this.x = false;
        }
        if (this.b) {
            dataHolder = a(context, this.x, this.c, this.d, this.e);
        } else {
            dataHolder = a(context, this.x, (String) null, (String) null, this.e);
        }
        xip.a();
        int i2 = 3;
        if (((Boolean) xhd.a.a()).booleanValue()) {
            wmi wmi = this.a;
            if (!this.x) {
                i = 3;
            } else {
                i = 2;
            }
            wmi.v = i;
        }
        if (this.w) {
            wmi wmi2 = this.a;
            if (this.b) {
                i2 = 2;
            }
            wmi2.w = i2;
        }
        xip.a();
        if (Boolean.valueOf(aywy.a.a().aU()).booleanValue()) {
            int i3 = dataHolder.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int a = dataHolder.a(i4);
                dataHolder.a("is_dasher", i4);
                dataHolder.d[a].putLong(0, i4, dataHolder.c.getInt("is_dasher"));
            }
        }
        return dataHolder;
    }

    private static boolean a(String str, String str2) {
        return str == null && !TextUtils.isEmpty(str2);
    }
}
