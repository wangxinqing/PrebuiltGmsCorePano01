package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Pair;
import com.google.android.chimera.CursorLoader;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: mmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mmo implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mmr a;

    public mmo(mmr mmr) {
        this.a = mmr;
    }

    private final boolean a(int i) {
        int[] iArr = this.a.g.k;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        return jhx.a(iArr, i);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        AvatarReference avatarReference;
        Cursor cursor = (Cursor) obj;
        mmr mmr = this.a;
        if (!mmr.i) {
            mmr.h = 0;
            mmr.b = new TreeMap(mmn.a);
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                do {
                    String string = cursor.getString(cursor.getColumnIndex("display_name"));
                    String string2 = cursor.getString(cursor.getColumnIndex("_id"));
                    int i = cursor.getInt(cursor.getColumnIndex("has_phone_number"));
                    String string3 = cursor.getString(cursor.getColumnIndex("photo_thumb_uri"));
                    Long valueOf = Long.valueOf(Long.parseLong(string2));
                    Uri uri = null;
                    if (string3 != null) {
                        avatarReference = new AvatarReference(3, string3);
                    } else {
                        avatarReference = null;
                    }
                    if (string3 != null) {
                        uri = Uri.parse(string3);
                    }
                    ContactPerson contactPerson = new ContactPerson(string, valueOf, avatarReference, uri);
                    if (a(0)) {
                        ArrayList arrayList = new ArrayList();
                        Cursor query = this.a.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{string2}, (String) null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                String string4 = query.getString(query.getColumnIndex("data1"));
                                if (string4 != null) {
                                    ContactPerson.ContactMethod contactMethod = new ContactPerson.ContactMethod(0, string4);
                                    if (!arrayList.contains(contactMethod)) {
                                        arrayList.add(contactMethod);
                                    }
                                }
                            }
                            query.close();
                        }
                        contactPerson.a(arrayList);
                    }
                    if (i > 0 && a(1)) {
                        ArrayList arrayList2 = new ArrayList();
                        Cursor query2 = this.a.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{string2}, (String) null);
                        if (query2 != null) {
                            while (query2.moveToNext()) {
                                String string5 = query2.getString(query2.getColumnIndex("data1"));
                                if (string5 != null) {
                                    ContactPerson.ContactMethod contactMethod2 = new ContactPerson.ContactMethod(1, string5);
                                    if (!arrayList2.contains(contactMethod2)) {
                                        arrayList2.add(contactMethod2);
                                    }
                                }
                            }
                            query2.close();
                        }
                        contactPerson.a(arrayList2);
                    }
                    if (!contactPerson.d.isEmpty()) {
                        this.a.b.put(contactPerson, new mmq());
                    }
                } while (cursor.moveToNext());
            }
            mmr mmr2 = this.a;
            mmr2.k = new mmk(new ArrayList(mmr2.b.keySet()), mmr2.getContext(), mmr2);
            mmr2.f.setAdapter(mmr2.k);
            mmr2.e.setAdapter(new mmf(new ArrayList(mmr2.b.keySet()), mmr2));
            mmr2.i = true;
            if (!this.a.d.isEmpty()) {
                mmr mmr3 = this.a;
                mmr3.h = mmr3.d.size();
                this.a.b();
                ArrayList arrayList3 = this.a.d;
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) arrayList3.get(i2);
                    ContactPerson contactPerson2 = (ContactPerson) pair.first;
                    ContactPerson.ContactMethod contactMethod3 = (ContactPerson.ContactMethod) pair.second;
                    if (mmr.d(contactPerson2)) {
                        this.a.c.add(contactMethod3);
                    } else {
                        ((mmq) this.a.b.get(contactPerson2)).a.add(contactMethod3);
                        mmr mmr4 = this.a;
                        mmr4.k.K(mmr4.a(contactPerson2));
                    }
                    this.a.a(contactPerson2, contactMethod3);
                }
                this.a.a();
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] strArr = {"_id", "display_name", "has_phone_number", "photo_thumb_uri"};
        return new CursorLoader(this.a.getContext(), uri, strArr, (String) null, new String[0], (String) null);
    }
}
