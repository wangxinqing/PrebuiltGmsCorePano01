package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* renamed from: drf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drf extends SearchIndexablesProvider {
    private drh a;

    public final boolean onCreate() {
        this.a = new drh(getContext().getApplicationContext());
        return true;
    }

    public final Cursor queryNonIndexableKeys(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        if (axdd.b()) {
            for (dri b : this.a.a(true)) {
                Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
                objArr[0] = b.b();
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    public final Cursor queryRawData(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        if (axdd.b()) {
            for (dri dri : this.a.a(false)) {
                Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
                objArr[1] = dri.a();
                GoogleSettingsItem googleSettingsItem = dri.b;
                objArr[2] = googleSettingsItem.i;
                List list = googleSettingsItem.l;
                String str = null;
                if (list != null && !list.isEmpty()) {
                    str = amre.a(",").a((Iterable) list);
                }
                objArr[5] = str;
                objArr[12] = dri.b();
                objArr[9] = dri.c;
                objArr[10] = dri.d;
                objArr[11] = dri.e;
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        return new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
    }
}
