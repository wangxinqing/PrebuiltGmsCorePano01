package defpackage;

import android.content.Context;
import com.google.android.chimera.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface bjm {
    Loader getModuleLoader();

    void superAbandon();

    boolean superCancelLoad();

    void superCommitContentChanged();

    String superDataToString(Object obj);

    void superDeliverCancellation();

    void superDeliverResult(Object obj);

    void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void superForceLoad();

    Context superGetContext();

    int superGetId();

    boolean superIsAbandoned();

    boolean superIsReset();

    boolean superIsStarted();

    void superOnAbandon();

    boolean superOnCancelLoad();

    void superOnContentChanged();

    void superOnForceLoad();

    void superOnReset();

    void superOnStartLoading();

    void superOnStopLoading();

    void superRegisterListener(int i, kl klVar);

    void superRegisterOnLoadCanceledListener(kk kkVar);

    void superReset();

    void superRollbackContentChanged();

    void superStopLoading();

    boolean superTakeContentChanged();

    String superToString();

    void superUnregisterListener(kl klVar);

    void superUnregisterOnLoadCanceledListener(kk kkVar);
}
