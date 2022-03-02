package defpackage;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SyncAdapterType;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: wwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wwt implements Runnable {
    private static final String[] a;
    private final wwr b;
    private final Context c;
    private final String d;
    private final Set[] e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_id");
        arrayList.add("mimetype");
        arrayList.add("data1");
        arrayList.add("data2");
        arrayList.add("data3");
        arrayList.add("data4");
        arrayList.add("data5");
        arrayList.add("data6");
        arrayList.add("data7");
        arrayList.add("data8");
        arrayList.add("data9");
        arrayList.add("data10");
        arrayList.add("data11");
        arrayList.add("data12");
        arrayList.add("data13");
        arrayList.add("data14");
        arrayList.add("data15");
        arrayList.add("is_primary");
        arrayList.add("contact_id");
        arrayList.add("account_type");
        int i = Build.VERSION.SDK_INT;
        arrayList.add("data_set");
        int i2 = Build.VERSION.SDK_INT;
        arrayList.add("times_used");
        a = (String[]) arrayList.toArray(new String[0]);
    }

    public wwt(wwr wwr, Context context, String str, Set[] setArr) {
        this.b = wwr;
        this.c = context;
        this.d = str;
        this.e = setArr;
    }

    public final void run() {
        ArrayList arrayList;
        wwr wwr;
        wvz wvz;
        Cursor query;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        ArrayList arrayList4;
        Iterator it;
        wwa wwa;
        ArrayList arrayList5;
        String str;
        String str2;
        String str3;
        SyncAdapterType[] syncAdapterTypeArr;
        AuthenticatorDescription[] authenticatorDescriptionArr;
        AuthenticatorDescription authenticatorDescription;
        Context context = this.c;
        synchronized (wwo.a) {
            if (wwo.b == null) {
                wwo.b = new wwo(context.getApplicationContext());
            }
        }
        wwo wwo = wwo.b;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList6 = new ArrayList();
        HashSet<String> hashSet = new HashSet<>();
        AccountManager accountManager = wwo.d;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        AuthenticatorDescription[] authenticatorTypes = accountManager.getAuthenticatorTypes();
        int length = syncAdapterTypes.length;
        int i = 0;
        while (i < length) {
            SyncAdapterType syncAdapterType = syncAdapterTypes[i];
            if ("com.android.contacts".equals(syncAdapterType.authority)) {
                String str4 = syncAdapterType.accountType;
                int length2 = authenticatorTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        authenticatorDescriptionArr = authenticatorTypes;
                        authenticatorDescription = null;
                        break;
                    }
                    authenticatorDescription = authenticatorTypes[i2];
                    authenticatorDescriptionArr = authenticatorTypes;
                    if (str4.equals(authenticatorDescription.type)) {
                        break;
                    }
                    i2++;
                    authenticatorTypes = authenticatorDescriptionArr;
                }
                if (authenticatorDescription != null) {
                    String str5 = authenticatorDescription.packageName;
                    syncAdapterTypeArr = syncAdapterTypes;
                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 56 + String.valueOf(str5).length());
                    sb.append("Registering external account type=");
                    sb.append(str4);
                    sb.append(", resourcePackageName=");
                    sb.append(str5);
                    sb.toString();
                    wwn wwn = new wwn(wwo.c, authenticatorDescription.packageName);
                    if (wwn.g) {
                        wwn.a = authenticatorDescription.type;
                        wwn.d = authenticatorDescription.labelId;
                        wwn.e = authenticatorDescription.iconId;
                        arrayList6.add(wwn);
                        hashSet.addAll(wwn.h);
                    }
                } else {
                    syncAdapterTypeArr = syncAdapterTypes;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 46);
                    sb2.append("No authenticator found for type=");
                    sb2.append(str4);
                    sb2.append(", ignoring it.");
                    Log.w("ExAccountTypeManager", sb2.toString());
                }
            } else {
                authenticatorDescriptionArr = authenticatorTypes;
                syncAdapterTypeArr = syncAdapterTypes;
            }
            i++;
            authenticatorTypes = authenticatorDescriptionArr;
            syncAdapterTypes = syncAdapterTypeArr;
        }
        int i3 = 106;
        if (!hashSet.isEmpty()) {
            int size = hashSet.size();
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("Registering ");
            sb3.append(size);
            sb3.append(" extension packages");
            sb3.toString();
            for (String str6 : hashSet) {
                wwn wwn2 = new wwn(wwo.c, str6);
                if (!wwn2.g) {
                    i3 = 106;
                } else if (!wwn2.i) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 83);
                    sb4.append("Skipping extension package ");
                    sb4.append(str6);
                    sb4.append(" because it doesn't have the CONTACTS_STRUCTURE metadata");
                    Log.w("ExAccountTypeManager", sb4.toString());
                } else if (TextUtils.isEmpty(wwn2.a)) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + i3);
                    sb5.append("Skipping extension package ");
                    sb5.append(str6);
                    sb5.append(" because the CONTACTS_STRUCTURE metadata doesn't have the accountType attribute");
                    Log.w("ExAccountTypeManager", sb5.toString());
                } else {
                    String str7 = wwn2.a;
                    String str8 = wwn2.b;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str7).length() + 67 + String.valueOf(str8).length() + String.valueOf(str6).length());
                    sb6.append("Registering extension package account type=");
                    sb6.append(str7);
                    sb6.append(", dataSet=");
                    sb6.append(str8);
                    sb6.append(", packageName=");
                    sb6.append(str6);
                    sb6.toString();
                    arrayList6.add(wwn2);
                    i3 = 106;
                }
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        int size2 = arrayList6.size();
        StringBuilder sb7 = new StringBuilder(106);
        sb7.append("Loaded meta-data for ");
        sb7.append(size2);
        sb7.append(" account types in ");
        sb7.append(elapsedRealtime2 - elapsedRealtime);
        sb7.append("ms(wall) ");
        sb7.append(currentThreadTimeMillis2 - currentThreadTimeMillis);
        sb7.append("ms(cpu)");
        Log.i("ExAccountTypeManager", sb7.toString());
        int length3 = this.e.length;
        wvz[] wvzArr = new wvz[length3];
        int i4 = 0;
        while (i4 < length3) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str9 : this.e[i4]) {
                    ArrayList arrayList7 = arrayList;
                    if (ycm.i(str9)) {
                        hashSet2.addAll(wwx.a(this.c, ycm.g(str9)));
                        arrayList = arrayList7;
                    } else if (ycm.j(str9)) {
                        ycm.e(str9);
                        hashSet2.addAll(Collections.emptySet());
                        arrayList = arrayList7;
                    } else if (wxh.e(str9)) {
                        hashSet2.addAll(wwx.b(this.c, wxh.h(str9)));
                        arrayList = arrayList7;
                    } else if (wxh.d(str9)) {
                        hashSet2.addAll(wwx.a(this.c, this.d, wxh.f(str9)));
                        arrayList = arrayList7;
                    } else if (wxh.a(str9)) {
                        hashSet2.addAll(wxh.c(wxh.b(str9)));
                        arrayList = arrayList7;
                    } else {
                        if (!ycm.k(str9)) {
                            str3 = "ContactsDataLoader";
                            str2 = "Invalid qualified ID";
                        } else {
                            str3 = "ContactsDataLoader";
                            str2 = "Unknown qualified ID type";
                        }
                        Log.w(str3, str2);
                        arrayList = arrayList7;
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    String str10 = (String) it2.next();
                    query = this.c.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendEncodedPath(str10).appendEncodedPath("entities").build(), a, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            if (query.getString(0) != null) {
                                String string = query.getString(1);
                                String[] strArr = new String[15];
                                int i5 = 0;
                                int i6 = 2;
                                while (i6 <= 16) {
                                    ArrayList arrayList9 = arrayList;
                                    Iterator it3 = it2;
                                    int i7 = i5 + 1;
                                    int i8 = Build.VERSION.SDK_INT;
                                    if (query.getType(i6) != 0) {
                                        str = query.getType(i6) == 4 ? new String(query.getBlob(i6)) : query.getString(i6);
                                    } else {
                                        str = null;
                                    }
                                    strArr[i5] = str;
                                    i6++;
                                    i5 = i7;
                                    arrayList = arrayList9;
                                    it2 = it3;
                                }
                                if (query.getInt(17) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String string2 = query.getString(19);
                                int i9 = Build.VERSION.SDK_INT;
                                String string3 = query.getString(20);
                                int i10 = Build.VERSION.SDK_INT;
                                int i11 = query.getInt(21);
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        arrayList4 = arrayList;
                                        it = it2;
                                        break;
                                    }
                                    wwn wwn3 = (wwn) it4.next();
                                    if (!ius.a(wwn3.a, string2)) {
                                        Iterator it5 = it2;
                                        arrayList5 = arrayList;
                                    } else if (ius.a(wwn3.b, string3)) {
                                        wwp wwp = (wwp) wwn3.f.get(string);
                                        if (wwp == null) {
                                            Iterator it6 = it2;
                                            arrayList5 = arrayList;
                                        } else if (wwp.c == null || wwp.d == null) {
                                            arrayList4 = arrayList;
                                            it = it2;
                                        } else {
                                            arrayList4 = arrayList;
                                            it = it2;
                                            wwa = new wwa(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, query.getLong(0)), query.getString(query.getColumnIndex(wwp.c)), wwn3.e, query.getString(query.getColumnIndex(wwp.d)), wwp.a, wwp.b, wwn3.d, wwn3.a);
                                        }
                                    } else {
                                        Iterator it7 = it2;
                                        arrayList5 = arrayList;
                                    }
                                }
                                wwa = null;
                                arrayList8.add(new wwj(str10, str10, string, i11, strArr, false, z, wwa));
                                arrayList3 = arrayList4;
                                it2 = it;
                            } else {
                                Iterator it8 = it2;
                                arrayList3 = arrayList;
                            }
                        }
                        ArrayList arrayList10 = arrayList;
                        Iterator it9 = it2;
                        try {
                            query.close();
                            arrayList2 = arrayList10;
                            it2 = it9;
                        } catch (Exception e2) {
                            arrayList2 = arrayList10;
                            it2 = it9;
                        }
                    } else {
                        Iterator it10 = it2;
                        arrayList2 = arrayList;
                    }
                }
                ArrayList arrayList11 = arrayList;
                if (!arrayList8.isEmpty()) {
                    wvz = new wvz((List) arrayList8);
                } else {
                    wvz = null;
                }
                wvzArr[i4] = wvz;
                i4++;
                arrayList6 = arrayList11;
            } catch (SecurityException e3) {
                try {
                    Log.e("ContactsDataLoader", "Error querying contact data:", e3);
                    wwr = this.b;
                } catch (Throwable th) {
                    this.b.a(Status.a, wvzArr);
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                try {
                    query.close();
                } catch (Exception e4) {
                }
                throw th3;
            }
        }
        wwr = this.b;
        wwr.a(Status.a, wvzArr);
    }
}
