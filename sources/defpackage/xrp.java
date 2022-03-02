package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xrp extends Fragment {
    private final ycw a = ybx.a;
    private final Map b = new HashMap();
    private Spinner c;

    private static final void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE owner_id = ? AND name = ?", new String[]{str, str2});
    }

    public static final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("force", true);
        return bundle;
    }

    public final void b() {
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(getContext().getDatabasePath("pluscontacts.db").toString(), (SQLiteDatabase.CursorFactory) null, 0);
        try {
            for (Account account : a()) {
                Cursor rawQuery = openDatabase.rawQuery("SELECT _id FROM owners WHERE account_name = ?1", new String[]{account.name});
                ArrayList<String> arrayList = new ArrayList<>();
                while (rawQuery.moveToNext()) {
                    arrayList.add(Long.toString(rawQuery.getLong(0)));
                }
                rawQuery.close();
                for (String str : arrayList) {
                    a(openDatabase, str, "people");
                    a(openDatabase, str, "gaiamap");
                    a(openDatabase, str, "autocomplete");
                }
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            List a2 = a();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                a((Account) a2.get(i), c());
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.menagerie_settings, viewGroup, false);
        a(inflate, (int) R.id.menagerie_settings_full_sync, (Runnable) new xri(this));
        a(inflate, (int) R.id.menagerie_settings_periodic_sync, (Runnable) new xrj(this));
        a(inflate, (int) R.id.menagerie_settings_initial_sync, (Runnable) new xrk(this));
        a(inflate, (int) R.id.menagerie_settings_tickle_sync, (Runnable) new xrl(this));
        this.c = (Spinner) inflate.findViewById(R.id.menagerie_settings_account_spinner);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), 17367048);
        arrayAdapter.setDropDownViewResource(17367049);
        arrayAdapter.add("All Accounts");
        anhj a2 = this.a.d(getContext()).iterator();
        while (a2.hasNext()) {
            Account account = (Account) a2.next();
            arrayAdapter.add(account.name);
            this.b.put(account.name, account);
        }
        this.c.setAdapter(arrayAdapter);
    }

    private static final void a(View view, int i, Runnable runnable) {
        ((Button) view.findViewById(i)).setOnClickListener(new xrm(runnable));
    }

    public final List a() {
        String str = (String) this.c.getSelectedItem();
        if (str.equals("All Accounts")) {
            return amzy.a(this.b.values());
        }
        if (this.b.containsKey(str)) {
            return amzy.a((Object) (Account) this.b.get(str));
        }
        return amzy.h();
    }

    public final void a(Account account, Bundle bundle) {
        try {
            ContentResolver.setSyncAutomatically(account, "com.google.android.gms.people", true);
            ContentResolver.requestSync(account, "com.google.android.gms.people", bundle);
            xro xro = new xro(this, getContext(), account);
            xro.b = ContentResolver.addStatusChangeListener(4, xro);
        } catch (Exception e) {
            Log.e("MenagerieDebugSettings", String.format("Request sync (%s) failed", new Object[]{account}), e);
            throw e;
        }
    }
}
