package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnl extends wnk {
    final /* synthetic */ wnw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnl(wnw wnw) {
        super(wnw);
        this.b = wnw;
    }

    public final void a(Bundle bundle, wtx wtx, String str) {
        StringBuilder sb = new StringBuilder(154);
        sb.append("SELECT DISTINCT M.gaia_id, M.contact_id FROM gaia_id_map AS M JOIN temp_gaia_ordinal AS O ON O.gaia_id = M.gaia_id WHERE M.owner_id = ? ORDER BY O.ordinal");
        Cursor a = wtx.a(sb.toString(), new String[]{str});
        wnw wnw = this.b;
        DataHolder dataHolder = new DataHolder(a, (Bundle) null);
        wnw.a(dataHolder);
        bundle.putParcelable("gaia_map", dataHolder);
    }
}
