package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyw extends nis {
    final zsg a = zsg.a("GetBackedUpOp");
    private final zvm b;
    private final String c;
    private final String d;
    private final String[] e;

    public zyw(zvm zvm, String str, String str2, String[] strArr) {
        super(135, "GetBackedUpDeviceContacts");
        this.c = str;
        this.b = zvm;
        this.d = str2;
        this.e = strArr;
    }

    public final void a(Context context) {
        zvm zvm;
        zsn zsn = new zsn(context);
        ArrayList arrayList = new ArrayList();
        try {
            for (aqxx aqxx : new zvu(context).a(zvr.a(context, this.c), this.d, this.e, "").a) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (aqxs aqxs : aqxx.d) {
                    zvy zvy = new zvy();
                    zvy.a = aqxs.a;
                    arrayList2.add(new EmailAddressEntity(zvy.a()));
                }
                for (aqxu aqxu : aqxx.e) {
                    zwa zwa = new zwa();
                    zwa.a = aqxu.a;
                    arrayList3.add(new PhoneNumberEntity(zwa.a()));
                }
                arrayList.add(new RawContactEntity(aqxx.a, arrayList2, arrayList3));
            }
            this.b.a(Status.a, arrayList);
            return;
        } catch (eif e2) {
            zsn.a(e2, azfa.l());
            this.a.d("Auth Exception when fetching contacts from server");
            zvm = this.b;
        } catch (babk e3) {
            zsn.a(e3, azfa.l());
            this.a.d("Operation Exception when fetching contacts from server");
            zvm = this.b;
        } catch (Throwable th) {
            this.b.a(Status.c, (List) null);
            throw th;
        }
        zvm.a(Status.c, (List) null);
    }

    public final void a(Status status) {
        this.b.a(status, (List) null);
    }
}
