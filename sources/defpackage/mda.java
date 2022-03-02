package defpackage;

import android.os.IInterface;

/* renamed from: mda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mda extends IInterface {
    mby createModuleContext(mby mby, String str, int i);

    mby createModuleContextNoCrashUtils(mby mby, String str, int i);

    int getIDynamiteLoaderVersion();

    int getModuleVersion(mby mby, String str);

    int getModuleVersion2(mby mby, String str, boolean z);

    int getModuleVersion2NoCrashUtils(mby mby, String str, boolean z);
}
