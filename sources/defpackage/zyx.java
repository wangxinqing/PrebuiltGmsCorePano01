package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyx extends nis {
    final zsg a = zsg.a("GetCachedBackedUpOp");
    private final String b;
    private final String c;
    private final String[] d;
    private final zvm e;

    public zyx(zvm zvm, String str, String str2, String[] strArr) {
        super(135, "GetCachedBackedUpContacts");
        this.b = str;
        this.e = zvm;
        this.c = str2;
        this.d = strArr;
    }

    public final void a(Context context) {
        ArrayList arrayList = new ArrayList();
        amri a2 = zyz.a.a(this.b, this.c, this.d);
        if (a2.a()) {
            aucx aucx = ((aqxb) a2.b()).a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aqxx aqxx = (aqxx) aucx.get(i);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                aucx aucx2 = aqxx.d;
                int size2 = aucx2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zvy zvy = new zvy();
                    zvy.a = ((aqxs) aucx2.get(i2)).a;
                    arrayList2.add(new EmailAddressEntity(zvy.a()));
                }
                aucx aucx3 = aqxx.e;
                int size3 = aucx3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    zwa zwa = new zwa();
                    zwa.a = ((aqxu) aucx3.get(i3)).a;
                    arrayList3.add(new PhoneNumberEntity(zwa.a()));
                }
                arrayList.add(new RawContactEntity(aqxx.a, arrayList2, arrayList3));
            }
        } else {
            this.a.d("No contacts found in cache for account : %s, device id : %s ", this.b, this.c);
        }
        this.a.a("Number of contacts found for account :  %s, deviceId : %s, Sources : %s is %d", this.b, this.c, Arrays.toString(this.d), Integer.valueOf(arrayList.size()));
        this.e.a(Status.a, arrayList);
    }

    public final void a(Status status) {
        this.e.a(status, (List) null);
    }
}
