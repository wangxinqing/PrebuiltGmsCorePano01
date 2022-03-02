package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnm extends wnk {
    final /* synthetic */ wnw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnm(wnw wnw) {
        super(wnw);
        this.b = wnw;
    }

    public final void a(Bundle bundle, wtx wtx, String str) {
        Bundle bundle2 = new Bundle();
        Cursor a = wtx.a("SELECT O.ordinal, P.gaia_id, P.name, P.name_verified, P.tagline, P.avatar, P.profile_type FROM people AS P JOIN temp_gaia_ordinal AS O ON O.qualified_id = P.qualified_id WHERE P.blocked = 0 AND P.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a2 = wtx.a("SELECT O.ordinal, E.email, E.type FROM emails AS E JOIN temp_gaia_ordinal AS O ON O.qualified_id = E.qualified_id WHERE E.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a3 = wtx.a("SELECT O.ordinal, P.phone, P.type FROM phones AS P JOIN temp_gaia_ordinal AS O ON O.qualified_id = P.qualified_id WHERE P.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a4 = wtx.a("SELECT O.ordinal, A.postal_address, A.type FROM postal_address AS A JOIN temp_gaia_ordinal AS O ON O.qualified_id = A.qualified_id WHERE A.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle3 = new Bundle();
        wnw wnw = this.b;
        DataHolder dataHolder = new DataHolder(a, (Bundle) null);
        wnw.a(dataHolder);
        bundle3.putParcelable("people", dataHolder);
        wnw wnw2 = this.b;
        DataHolder dataHolder2 = new DataHolder(a2, (Bundle) null);
        wnw2.a(dataHolder2);
        bundle3.putParcelable("people_email", dataHolder2);
        wnw wnw3 = this.b;
        DataHolder dataHolder3 = new DataHolder(a3, (Bundle) null);
        wnw3.a(dataHolder3);
        bundle3.putParcelable("people_phone", dataHolder3);
        wnw wnw4 = this.b;
        DataHolder dataHolder4 = new DataHolder(a4, (Bundle) null);
        wnw4.a(dataHolder4);
        bundle3.putParcelable("people_address", dataHolder4);
        bundle2.putAll(bundle3);
        Cursor a5 = wtx.a("SELECT O.ordinal, C.circle_id, C.name, C.people_count FROM circle_members AS CM JOIN temp_gaia_ordinal AS O ON O.qualified_id = CM.qualified_id JOIN circles AS C ON C.circle_id = CM.circle_id AND C.owner_id = CM.owner_id WHERE C.owner_id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle4 = new Bundle();
        wnw wnw5 = this.b;
        DataHolder dataHolder5 = new DataHolder(a5, (Bundle) null);
        wnw5.a(dataHolder5);
        bundle4.putParcelable("circles", dataHolder5);
        bundle2.putAll(bundle4);
        Cursor a6 = wtx.a("SELECT O.ordinal, U.gaia_id, U.display_name, U.avatar FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.gaia_id = U.gaia_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a7 = wtx.a("SELECT O.ordinal, E.email, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_emails AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a8 = wtx.a("SELECT O.ordinal, E.phone, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_phones AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Cursor a9 = wtx.a("SELECT O.ordinal, E.postal_address, E.type FROM owners AS U JOIN temp_gaia_ordinal AS O ON O.qualified_id = U.gaia_id JOIN owner_postal_address AS E ON U._id = E.owner_id WHERE U._id = ? ORDER BY O.ordinal", new String[]{str});
        Bundle bundle5 = new Bundle();
        wnw wnw6 = this.b;
        DataHolder dataHolder6 = new DataHolder(a6, (Bundle) null);
        wnw6.a(dataHolder6);
        bundle5.putParcelable("owner", dataHolder6);
        wnw wnw7 = this.b;
        DataHolder dataHolder7 = new DataHolder(a7, (Bundle) null);
        wnw7.a(dataHolder7);
        bundle5.putParcelable("owner_email", dataHolder7);
        wnw wnw8 = this.b;
        DataHolder dataHolder8 = new DataHolder(a8, (Bundle) null);
        wnw8.a(dataHolder8);
        bundle5.putParcelable("owner_phone", dataHolder8);
        wnw wnw9 = this.b;
        DataHolder dataHolder9 = new DataHolder(a9, (Bundle) null);
        wnw9.a(dataHolder9);
        bundle5.putParcelable("owner_address", dataHolder9);
        bundle2.putAll(bundle5);
        bundle.putBundle("db", bundle2);
    }
}
