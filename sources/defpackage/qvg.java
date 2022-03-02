package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: qvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qvg {
    private static final Method b;
    private static final Method c;
    private final JobScheduler a;

    public qvg(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    public static void a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfo);
            return;
        }
        qvg qvg = new qvg(jobScheduler);
        Method method = c;
        int i = 0;
        if (method != null) {
            try {
                i = ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        qvg.a(jobInfo, str, i, str2);
    }

    static {
        Method method;
        Method method2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    method = null;
                } else {
                    method = null;
                }
            }
        } else {
            method = null;
        }
        b = method;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                method2 = UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        c = method2;
    }

    public final int a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.a.schedule(jobInfo);
    }

    public final List a() {
        return this.a.getAllPendingJobs();
    }

    public final void a(int i) {
        this.a.cancel(i);
    }
}
