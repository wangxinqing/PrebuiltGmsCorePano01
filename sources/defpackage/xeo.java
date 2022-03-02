package defpackage;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xeo extends xea {
    public xeo(xdz xdz, Person person, Map map, boolean z) {
        super(xdz, person, map, z);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, Object obj2) {
        Person.Names names = (Person.Names) obj;
        ContentValues contentValues = (ContentValues) obj2;
        contentValues.put("display_name", names.b);
        contentValues.put("formatted_name", names.d);
        contentValues.put("given_name", names.e);
        contentValues.put("family_name", names.c);
        contentValues.put("middle_name", names.i);
        contentValues.put("honorific_suffix", names.g);
        contentValues.put("honorific_prefix", names.f);
        contentValues.put("yomi_given_name", names.k);
        contentValues.put("yomi_family_name", names.j);
        contentValues.put("yomi_honorific_suffix", names.m);
        contentValues.put("yomi_honorific_prefix", names.l);
    }
}
