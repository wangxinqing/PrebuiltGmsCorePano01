package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: onc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onc extends nzj {
    private final WeakReference e;
    private final String f;
    private final List g = new ArrayList();

    public onc(HelpChimeraActivity helpChimeraActivity, String str) {
        super(helpChimeraActivity);
        this.e = new WeakReference(helpChimeraActivity);
        this.f = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.e.get();
        if (helpChimeraActivity != null) {
            ArrayList arrayList = new ArrayList(this.g);
            if (list != null) {
                HelpConfig helpConfig = helpChimeraActivity.x;
                for (int i = 0; i < list.size(); i++) {
                    omv omv = (omv) list.get(i);
                    if (!this.g.contains(omv) && !(omv.a == 1 && oab.a(omv.d, oal.a(), helpConfig) == null)) {
                        Context applicationContext = helpChimeraActivity.getApplicationContext();
                        if (omv.a == 2) {
                            try {
                                if (!new oaf(applicationContext).a(oab.b(omv.e, ""))) {
                                }
                            } catch (JSONException e2) {
                            }
                        }
                        arrayList.add(omv);
                    }
                }
            }
            onf onf = helpChimeraActivity.j;
            onf.c.setAdapter(onf.e);
            onb onb = onf.e;
            onb.e = arrayList;
            onb.as();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Cursor cursor;
        Void[] voidArr = (Void[]) objArr;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.e.get();
        if (helpChimeraActivity == null) {
            return null;
        }
        HelpConfig helpConfig = helpChimeraActivity.x;
        oar oar = helpChimeraActivity.l;
        aoru aoru = helpChimeraActivity.d;
        okc okc = helpChimeraActivity.y;
        Context applicationContext = helpChimeraActivity.getApplicationContext();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        if (!jkr.a() || jkr.c()) {
            if (!isEmpty) {
                cursor = oar.a(this.f);
            } else {
                cursor = oar.a();
            }
            try {
                int columnIndex = cursor.getColumnIndex("suggest_intent_query");
                while (cursor.moveToNext()) {
                    this.g.add(new omv(cursor.getString(columnIndex)));
                }
            } finally {
                cursor.close();
            }
        }
        if (isEmpty || !helpConfig.h() || jkf.b(applicationContext)) {
            return null;
        }
        return ond.a(applicationContext, helpConfig, aoru, okc, this.f);
    }
}
