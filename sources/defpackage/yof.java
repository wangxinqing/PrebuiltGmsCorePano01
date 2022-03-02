package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: yof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yof implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ yok a;

    public yof(yok yok) {
        this.a = yok;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader = new CursorLoader(this.a.getActivity());
        cursorLoader.setUri(ContactsContract.CommonDataKinds.Email.CONTENT_URI);
        cursorLoader.setProjection(yoq.b);
        cursorLoader.setSelection(yok.a);
        String concat = String.valueOf(this.a.c).concat("%");
        String str = this.a.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
        sb.append("% ");
        sb.append(str);
        sb.append("%");
        cursorLoader.setSelectionArgs(new String[]{this.a.j, concat, concat, sb.toString()});
        return cursorLoader;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        znm znm;
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            yod yod = (yod) this.a.getListAdapter();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                String string = cursor.getString(3);
                if (!TextUtils.isEmpty(string) && !hashSet.contains(string)) {
                    hashSet.add(string);
                    String string2 = cursor.getString(2);
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                    AudienceMember a2 = AudienceMember.a(string, string2);
                    if (!string.equals(string2)) {
                        a2.h.putString("secondaryText", string);
                    }
                    a2.h.putString("contactsAvatarUri", lookupUri.toString());
                    a2.h.putInt("contactType", 1);
                    arrayList.add(a2);
                }
            }
            if (arrayList.size() > 0) {
                znm = new znm((yoy) yod, (int) R.string.plus_audience_selection_search_device_results, (zni) new yoo(yod, arrayList, 0, arrayList.size(), 3));
            } else {
                znm = null;
            }
            yod.d = znm;
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
