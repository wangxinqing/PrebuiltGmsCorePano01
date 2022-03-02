package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: won  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class won extends wnc {
    private final String b;

    public final DataHolder d(Context context) {
        String str = this.l;
        String str2 = this.b;
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        bundle.putString("pagegaiaid", str2);
        wop.a(context, str, str2, bundle);
        wtx b2 = wtz.a(context).b();
        if (b2 == null) {
            return DataHolder.a(new String[0]).a(13);
        }
        return new DataHolder(b2.a("SELECT c.contact_id AS contact_id,c.display_name AS display_name,i.value AS phone_number,p.last_update_time AS last_update_time FROM ac_people AS p JOIN ac_container AS c ON p._id=c.people_id JOIN ac_item AS i ON c._id=i.container_id WHERE (p.owner_id=?)AND (c.container_type=1)AND (i.item_type=2)ORDER BY display_name,people_v2_id", new String[]{wtw.a(context).b(str, str2)}), bundle);
    }

    public won(String str, int i, wzv wzv, String str2, String str3) {
        super(str, i, wzv, str2, "LoadPhoneNumbers", (byte[]) null);
        this.b = str3;
    }
}
