package defpackage;

import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

/* renamed from: sug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface sug extends IInterface {
    List a(String str, String str2, AppMetadata appMetadata);

    List a(String str, String str2, String str3);

    List a(String str, String str2, String str3, boolean z);

    List a(String str, String str2, boolean z, AppMetadata appMetadata);

    void a(long j, String str, String str2, String str3);

    void a(AppMetadata appMetadata);

    void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel);

    void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata);

    void a(EventParcel eventParcel, AppMetadata appMetadata);

    void a(EventParcel eventParcel, String str, String str2);

    void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata);

    String b(AppMetadata appMetadata);
}
