package defpackage;

/* renamed from: ayao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayao implements ayan {
    public static final agvx accuracyFactor;
    public static final agvx accuracyOutputFilterMaxAgeInWindowNanos;
    public static final agvx allowProposingFromGnss;
    public static final agvx altitudeFilterFloorLabelValidTimeSeconds;
    public static final agvx altitudeFilterGpsValidTimeSeconds;
    public static final agvx altitudeFilterWifiValidTimeSeconds;
    public static final agvx alwaysRunAfterOneStep;
    public static final agvx blueskyShadowsProbabilityDensityForInvalidGrid;
    public static final agvx blueskyShadowsProbabilityDeweightingFactor;
    public static final agvx blueskyUpdateMaxAgeS;
    public static final agvx blueskyUpdateTimeoutForProposeFromGnssSec;
    public static final agvx clearcutFlpVersionsFix147319069;
    public static final agvx clearcutFlpVersionsLoggingEnabled;
    public static final agvx enableAccuracyOutputFilter;
    public static final agvx enableActivityAwareKalmanFilter;
    public static final agvx enableArForDriving;
    public static final agvx enableBearingRangeFix143083454;
    public static final agvx enableBlueskyShadowLikelihood;
    public static final agvx enableDifferentialBearingFix140500114;
    public static final agvx enableIncomingPositionAccuracyScaling;
    public static final agvx enableLogcatLogger;
    public static final agvx enableOutputFilterTimestampFix;
    public static final agvx enableOutputKalmanFilter;
    public static final agvx flpInertialAnchorBugReportBufferSizeBytes;
    public static final agvx flpInertialAnchorConfigurationIndex;
    public static final agvx flpInertialAnchorUseStatefulLogging;
    public static final agvx flpParticleFusionBugReportMaxBufferSize;
    public static final agvx flpParticleFusionBugReportStoreDataArrayOnly;
    public static final agvx flpParticleFusionBugReportWindowSec;
    public static final agvx flpParticleFusionClearcutMaxCarryChangeDeltas;
    public static final agvx flpParticleFusionClearcutMaxFilterUpDeltas;
    public static final agvx flpParticleFusionClearcutMaxPositionReInitDeltas;
    public static final agvx flpParticleFusionClearcutMaxReProjectionDeltas;
    public static final agvx flpParticleFusionEnableOutputFilter;
    public static final agvx flpParticleFusionExtendedBugReport;
    public static final agvx flpParticleFusionRejectionThresholdSigmaMultiplier;
    public static final agvx flpParticleFusionUseFop;
    public static final agvx flpParticleFusionUsePositionLikelihoodClipping;
    public static final agvx flpReportLocationOnStepUpdate;
    public static final agvx flpUseParticleFusion;
    public static final agvx globalAccuracyFactor;
    public static final agvx gnssMaxStdDevM;
    public static final agvx gnssMinStdDevM;
    public static final agvx gnssRejectionDistanceM;
    public static final agvx gnssRejectionPeriodS;
    public static final agvx gnssStdDevScale;
    public static final agvx initializationWindowLengthS;
    public static final agvx maxAccuracyM;
    public static final agvx maxBearingGapS;
    public static final agvx maxGnssAgeForNotRequestingWifiScansS;
    public static final agvx maxGnssEvidenceAgeS;
    public static final agvx maxGnssWifiDistanceForGnssOnlyM;
    public static final agvx maxStepEvidenceAgeS;
    public static final agvx maxWifiEvidenceAgeS;
    public static final agvx minAccuracyM;
    public static final agvx nominalSigmaScaleGnss;
    public static final agvx nominalSigmaScaleWifi;
    public static final agvx notRequestWifiScansWhenProposingFromGnss;
    public static final agvx numberOfParticles;
    public static final agvx outputKalmanFilterEnableReset;
    public static final agvx outputKalmanFilterResetThresholdM;
    public static final agvx outputLinearKfProcessNoiseFeetPosM;
    public static final agvx outputLinearKfProcessNoiseFeetVelMps;
    public static final agvx outputLinearKfProcessNoiseUnknownPosM;
    public static final agvx outputLinearKfProcessNoiseUnknownVelMps;
    public static final agvx outputLinearKfProcessNoiseWheelsPosM;
    public static final agvx outputLinearKfProcessNoiseWheelsVelMps;
    public static final agvx positionEmitThresholdS;
    public static final agvx positionProposalGnssBlueskyMinSpeedThresholdMps;
    public static final agvx positionProposalGnssMaxAccuracyThresholdM;
    public static final agvx positionProposalGnssMinSpeedThresholdMps;
    public static final agvx reInitAccuracyThresholdMultiplierGnss;
    public static final agvx reInitAccuracyThresholdMultiplierWifi;
    public static final agvx requiredStepCount;
    public static final agvx resamplingThreshold;
    public static final agvx resetLocationAfterReinit;
    public static final agvx resetLocationAfterReinitV2;
    public static final agvx speedUpperThresholdMps;
    public static final agvx stepLengthFactor;
    public static final agvx stepLengthNoiseSigmaM;
    public static final agvx stepTimeoutThresholdSeconds;
    public static final agvx temporalHeadingNoiseSigmaRad;
    public static final agvx temporalPositionNoiseSigmaM;
    public static final agvx useAltitudeFilter;
    public static final agvx useNStepActivationFilter;
    public static final agvx wifiAccuracyUpperBoundBeforeRejectedMm;
    public static final agvx wifiMaxStdDevM;
    public static final agvx wifiMinStdDevM;
    public static final agvx wifiRejectionDistanceM;
    public static final agvx wifiRejectionPeriodS;
    public static final agvx wifiStdDevScale;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        accuracyFactor = agvx.a(a, "Flp18__accuracy_factor", 1.0d);
        accuracyOutputFilterMaxAgeInWindowNanos = agvx.a(a, "Flp18__accuracy_output_filter_max_age_in_window_nanos", 5000000000L);
        allowProposingFromGnss = agvx.a(a, "Flp18__allow_proposing_from_gnss", true);
        altitudeFilterFloorLabelValidTimeSeconds = agvx.a(a, "Flp18__altitude_filter_floor_label_valid_time_seconds", 0.0d);
        altitudeFilterGpsValidTimeSeconds = agvx.a(a, "Flp18__altitude_filter_gps_valid_time_seconds", 60.0d);
        altitudeFilterWifiValidTimeSeconds = agvx.a(a, "Flp18__altitude_filter_wifi_valid_time_seconds", 60.0d);
        alwaysRunAfterOneStep = agvx.a(a, "Flp18__always_run_after_one_step", true);
        blueskyShadowsProbabilityDensityForInvalidGrid = agvx.a(a, "Flp18__bluesky_shadows_probability_density_for_invalid_grid", 1.0E-4d);
        blueskyShadowsProbabilityDeweightingFactor = agvx.a(a, "Flp18__bluesky_shadows_probability_deweighting_factor", 8.0d);
        blueskyUpdateMaxAgeS = agvx.a(a, "Flp18__bluesky_update_max_age_s", 0.5d);
        blueskyUpdateTimeoutForProposeFromGnssSec = agvx.a(a, "Flp18__bluesky_update_timeout_for_propose_from_gnss_sec", -1.0d);
        clearcutFlpVersionsFix147319069 = agvx.a(a, "Flp18__clearcut_flp_versions_fix_147319069", true);
        clearcutFlpVersionsLoggingEnabled = agvx.a(a, "Flp18__clearcut_flp_versions_logging_enabled", true);
        enableAccuracyOutputFilter = agvx.a(a, "Flp18__enable_accuracy_output_filter", true);
        enableActivityAwareKalmanFilter = agvx.a(a, "Flp18__enable_activity_aware_kalman_filter", true);
        enableArForDriving = agvx.a(a, "Flp18__enable_ar_for_driving", false);
        enableBearingRangeFix143083454 = agvx.a(a, "Flp18__enable_bearing_range_fix_143083454", false);
        enableBlueskyShadowLikelihood = agvx.a(a, "Flp18__enable_bluesky_shadow_likelihood", false);
        enableDifferentialBearingFix140500114 = agvx.a(a, "Flp18__enable_differential_bearing_fix_140500114", true);
        enableIncomingPositionAccuracyScaling = agvx.a(a, "Flp18__enable_incoming_position_accuracy_scaling", true);
        enableLogcatLogger = agvx.a(a, "Flp18__enable_logcat_logger", false);
        enableOutputFilterTimestampFix = agvx.a(a, "Flp18__enable_output_filter_timestamp_fix", false);
        enableOutputKalmanFilter = agvx.a(a, "Flp18__enable_output_kalman_filter", true);
        flpInertialAnchorBugReportBufferSizeBytes = agvx.a(a, "flp_inertial_anchor_bug_report_buffer_size_bytes", 0);
        flpInertialAnchorConfigurationIndex = agvx.a(a, "flp_inertial_anchor_configuration_index", 3);
        flpInertialAnchorUseStatefulLogging = agvx.a(a, "flp_inertial_anchor_use_stateful_logging", false);
        flpParticleFusionBugReportMaxBufferSize = agvx.a(a, "flp_particle_fusion_bug_report_max_buffer_size", 5000);
        flpParticleFusionBugReportStoreDataArrayOnly = agvx.a(a, "Flp18__flp_particle_fusion_bug_report_store_data_array_only", true);
        flpParticleFusionBugReportWindowSec = agvx.a(a, "flp_particle_fusion_bug_report_window_sec", 600.0d);
        flpParticleFusionClearcutMaxCarryChangeDeltas = agvx.a(a, "flp_particle_fusion_clearcut_max_carry_change_deltas", 1000);
        flpParticleFusionClearcutMaxFilterUpDeltas = agvx.a(a, "flp_particle_fusion_clearcut_max_filter_up_deltas", 100);
        flpParticleFusionClearcutMaxPositionReInitDeltas = agvx.a(a, "flp_particle_fusion_clearcut_max_position_re_init_deltas", 100);
        flpParticleFusionClearcutMaxReProjectionDeltas = agvx.a(a, "flp_particle_fusion_clearcut_max_re_projection_deltas", 100);
        flpParticleFusionEnableOutputFilter = agvx.a(a, "flp_particle_fusion_enable_output_filter", false);
        flpParticleFusionExtendedBugReport = agvx.a(a, "flp_particle_fusion_extended_bug_report", false);
        flpParticleFusionRejectionThresholdSigmaMultiplier = agvx.a(a, "flp_particle_fusion_rejection_threshold_sigma_multiplier", 4.0d);
        flpParticleFusionUseFop = agvx.a(a, "flp_particle_fusion_use_fop", false);
        flpParticleFusionUsePositionLikelihoodClipping = agvx.a(a, "flp_particle_fusion_use_position_likelihood_clipping", true);
        flpReportLocationOnStepUpdate = agvx.a(a, "flp_report_location_on_step_update", false);
        flpUseParticleFusion = agvx.a(a, "flp_use_particle_fusion", false);
        globalAccuracyFactor = agvx.a(a, "Flp18__global_accuracy_factor", 1.0d);
        gnssMaxStdDevM = agvx.a(a, "Flp18__gnss_max_std_dev_m", 100.0d);
        gnssMinStdDevM = agvx.a(a, "Flp18__gnss_min_std_dev_m", 5.0d);
        gnssRejectionDistanceM = agvx.a(a, "Flp18__gnss_rejection_distance_m", 0.5d);
        gnssRejectionPeriodS = agvx.a(a, "Flp18__gnss_rejection_period_s", 0.5d);
        gnssStdDevScale = agvx.a(a, "Flp18__gnss_std_dev_scale", 2.5d);
        initializationWindowLengthS = agvx.a(a, "Flp18__initialization_window_length_s", 6.0d);
        maxAccuracyM = agvx.a(a, "Flp18__max_accuracy_m", 150.0d);
        maxBearingGapS = agvx.a(a, "Flp18__max_bearing_gap_s", 2.0d);
        maxGnssAgeForNotRequestingWifiScansS = agvx.a(a, "Flp18__max_gnss_age_for_not_requesting_wifi_scans_s", 3.0d);
        maxGnssEvidenceAgeS = agvx.a(a, "Flp18__max_gnss_evidence_age_s", 5.0d);
        maxGnssWifiDistanceForGnssOnlyM = agvx.a(a, "Flp18__max_gnss_wifi_distance_for_gnss_only_m", 500.0d);
        maxStepEvidenceAgeS = agvx.a(a, "Flp18__max_step_evidence_age_s", 15.0d);
        maxWifiEvidenceAgeS = agvx.a(a, "Flp18__max_wifi_evidence_age_s", 10.0d);
        minAccuracyM = agvx.a(a, "Flp18__min_accuracy_m", 3.0d);
        nominalSigmaScaleGnss = agvx.a(a, "flp_particle_fusion_nominal_sigma_scale_gnss", 1.716d);
        nominalSigmaScaleWifi = agvx.a(a, "flp_particle_fusion_nominal_sigma_scale_wifi", 0.84d);
        notRequestWifiScansWhenProposingFromGnss = agvx.a(a, "Flp18__not_request_wifi_scans_when_proposing_from_gnss", true);
        numberOfParticles = agvx.a(a, "flp_particle_fusion_number_of_particles", 500);
        outputKalmanFilterEnableReset = agvx.a(a, "Flp18__output_kalman_filter_enable_reset", true);
        outputKalmanFilterResetThresholdM = agvx.a(a, "Flp18__output_kalman_filter_reset_threshold_m", 250.0d);
        outputLinearKfProcessNoiseFeetPosM = agvx.a(a, "Flp18__output_linear_kf_process_noise_feet_pos_m", 2.33d);
        outputLinearKfProcessNoiseFeetVelMps = agvx.a(a, "Flp18__output_linear_kf_process_noise_feet_vel_mps", 0.17d);
        outputLinearKfProcessNoiseUnknownPosM = agvx.a(a, "Flp18__output_linear_kf_process_noise_unknown_pos_m", 5.439d);
        outputLinearKfProcessNoiseUnknownVelMps = agvx.a(a, "Flp18__output_linear_kf_process_noise_unknown_vel_mps", 3.63d);
        outputLinearKfProcessNoiseWheelsPosM = agvx.a(a, "Flp18__output_linear_kf_process_noise_wheels_pos_m", 5.171d);
        outputLinearKfProcessNoiseWheelsVelMps = agvx.a(a, "Flp18__output_linear_kf_process_noise_wheels_vel_mps", 6.718d);
        positionEmitThresholdS = agvx.a(a, "Flp18__position_emit_threshold_s", 0.5d);
        positionProposalGnssBlueskyMinSpeedThresholdMps = agvx.a(a, "Flp18__position_proposal_gnss_bluesky_min_speed_threshold_mps", 2.25d);
        positionProposalGnssMaxAccuracyThresholdM = agvx.a(a, "Flp18__position_proposal_gnss_max_accuracy_threshold_m", 18.75d);
        positionProposalGnssMinSpeedThresholdMps = agvx.a(a, "Flp18__position_proposal_gnss_min_speed_threshold_mps", 1.5d);
        reInitAccuracyThresholdMultiplierGnss = agvx.a(a, "Flp18__re_init_accuracy_threshold_multiplier_gnss", 2.0d);
        reInitAccuracyThresholdMultiplierWifi = agvx.a(a, "Flp18__re_init_accuracy_threshold_multiplier_wifi", 3.0d);
        requiredStepCount = agvx.a(a, "Flp18__required_step_count", 5);
        resamplingThreshold = agvx.a(a, "flp_particle_fusion_resampling_threshold", 0.572d);
        resetLocationAfterReinit = agvx.a(a, "Flp18__reset_location_after_reinit", true);
        resetLocationAfterReinitV2 = agvx.a(a, "Flp18__reset_location_after_reinit_v2", false);
        speedUpperThresholdMps = agvx.a(a, "flp_particle_filter_speed_upper_threshold_mps", 5.0d);
        stepLengthFactor = agvx.a(a, "flp_particle_fusion_step_length_factor", 1.071d);
        stepLengthNoiseSigmaM = agvx.a(a, "flp_particle_fusion_step_length_noise_sigma_m", 0.729d);
        stepTimeoutThresholdSeconds = agvx.a(a, "Flp18__step_timeout_threshold_seconds", 22.0d);
        temporalHeadingNoiseSigmaRad = agvx.a(a, "flp_particle_fusion_temporal_heading_noise_sigma_rad", 0.08d);
        temporalPositionNoiseSigmaM = agvx.a(a, "flp_particle_fusion_temporal_position_noise_sigma_m", 1.36d);
        useAltitudeFilter = agvx.a(a, "Flp18__use_altitude_filter", true);
        useNStepActivationFilter = agvx.a(a, "Flp18__use_n_step_activation_filter", true);
        wifiAccuracyUpperBoundBeforeRejectedMm = agvx.a(a, "flp_particle_fusion_wifi_accuracy_upper_bound_mm", 80000);
        wifiMaxStdDevM = agvx.a(a, "Flp18__wifi_max_std_dev_m", 200.0d);
        wifiMinStdDevM = agvx.a(a, "Flp18__wifi_min_std_dev_m", 1.0d);
        wifiRejectionDistanceM = agvx.a(a, "Flp18__wifi_rejection_distance_m", 0.5d);
        wifiRejectionPeriodS = agvx.a(a, "Flp18__wifi_rejection_period_s", 2.5d);
        wifiStdDevScale = agvx.a(a, "Flp18__wifi_std_dev_scale", 1.0d);
    }

    public double accuracyFactor() {
        return ((Double) accuracyFactor.c()).doubleValue();
    }

    public long accuracyOutputFilterMaxAgeInWindowNanos() {
        return ((Long) accuracyOutputFilterMaxAgeInWindowNanos.c()).longValue();
    }

    public boolean allowProposingFromGnss() {
        return ((Boolean) allowProposingFromGnss.c()).booleanValue();
    }

    public double altitudeFilterFloorLabelValidTimeSeconds() {
        return ((Double) altitudeFilterFloorLabelValidTimeSeconds.c()).doubleValue();
    }

    public double altitudeFilterGpsValidTimeSeconds() {
        return ((Double) altitudeFilterGpsValidTimeSeconds.c()).doubleValue();
    }

    public double altitudeFilterWifiValidTimeSeconds() {
        return ((Double) altitudeFilterWifiValidTimeSeconds.c()).doubleValue();
    }

    public boolean alwaysRunAfterOneStep() {
        return ((Boolean) alwaysRunAfterOneStep.c()).booleanValue();
    }

    public double blueskyShadowsProbabilityDensityForInvalidGrid() {
        return ((Double) blueskyShadowsProbabilityDensityForInvalidGrid.c()).doubleValue();
    }

    public double blueskyShadowsProbabilityDeweightingFactor() {
        return ((Double) blueskyShadowsProbabilityDeweightingFactor.c()).doubleValue();
    }

    public double blueskyUpdateMaxAgeS() {
        return ((Double) blueskyUpdateMaxAgeS.c()).doubleValue();
    }

    public double blueskyUpdateTimeoutForProposeFromGnssSec() {
        return ((Double) blueskyUpdateTimeoutForProposeFromGnssSec.c()).doubleValue();
    }

    public boolean clearcutFlpVersionsFix147319069() {
        return ((Boolean) clearcutFlpVersionsFix147319069.c()).booleanValue();
    }

    public boolean clearcutFlpVersionsLoggingEnabled() {
        return ((Boolean) clearcutFlpVersionsLoggingEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableAccuracyOutputFilter() {
        return ((Boolean) enableAccuracyOutputFilter.c()).booleanValue();
    }

    public boolean enableActivityAwareKalmanFilter() {
        return ((Boolean) enableActivityAwareKalmanFilter.c()).booleanValue();
    }

    public boolean enableArForDriving() {
        return ((Boolean) enableArForDriving.c()).booleanValue();
    }

    public boolean enableBearingRangeFix143083454() {
        return ((Boolean) enableBearingRangeFix143083454.c()).booleanValue();
    }

    public boolean enableBlueskyShadowLikelihood() {
        return ((Boolean) enableBlueskyShadowLikelihood.c()).booleanValue();
    }

    public boolean enableDifferentialBearingFix140500114() {
        return ((Boolean) enableDifferentialBearingFix140500114.c()).booleanValue();
    }

    public boolean enableIncomingPositionAccuracyScaling() {
        return ((Boolean) enableIncomingPositionAccuracyScaling.c()).booleanValue();
    }

    public boolean enableLogcatLogger() {
        return ((Boolean) enableLogcatLogger.c()).booleanValue();
    }

    public boolean enableOutputFilterTimestampFix() {
        return ((Boolean) enableOutputFilterTimestampFix.c()).booleanValue();
    }

    public boolean enableOutputKalmanFilter() {
        return ((Boolean) enableOutputKalmanFilter.c()).booleanValue();
    }

    public long flpInertialAnchorBugReportBufferSizeBytes() {
        return ((Long) flpInertialAnchorBugReportBufferSizeBytes.c()).longValue();
    }

    public long flpInertialAnchorConfigurationIndex() {
        return ((Long) flpInertialAnchorConfigurationIndex.c()).longValue();
    }

    public boolean flpInertialAnchorUseStatefulLogging() {
        return ((Boolean) flpInertialAnchorUseStatefulLogging.c()).booleanValue();
    }

    public long flpParticleFusionBugReportMaxBufferSize() {
        return ((Long) flpParticleFusionBugReportMaxBufferSize.c()).longValue();
    }

    public boolean flpParticleFusionBugReportStoreDataArrayOnly() {
        return ((Boolean) flpParticleFusionBugReportStoreDataArrayOnly.c()).booleanValue();
    }

    public double flpParticleFusionBugReportWindowSec() {
        return ((Double) flpParticleFusionBugReportWindowSec.c()).doubleValue();
    }

    public long flpParticleFusionClearcutMaxCarryChangeDeltas() {
        return ((Long) flpParticleFusionClearcutMaxCarryChangeDeltas.c()).longValue();
    }

    public long flpParticleFusionClearcutMaxFilterUpDeltas() {
        return ((Long) flpParticleFusionClearcutMaxFilterUpDeltas.c()).longValue();
    }

    public long flpParticleFusionClearcutMaxPositionReInitDeltas() {
        return ((Long) flpParticleFusionClearcutMaxPositionReInitDeltas.c()).longValue();
    }

    public long flpParticleFusionClearcutMaxReProjectionDeltas() {
        return ((Long) flpParticleFusionClearcutMaxReProjectionDeltas.c()).longValue();
    }

    public boolean flpParticleFusionEnableOutputFilter() {
        return ((Boolean) flpParticleFusionEnableOutputFilter.c()).booleanValue();
    }

    public boolean flpParticleFusionExtendedBugReport() {
        return ((Boolean) flpParticleFusionExtendedBugReport.c()).booleanValue();
    }

    public double flpParticleFusionRejectionThresholdSigmaMultiplier() {
        return ((Double) flpParticleFusionRejectionThresholdSigmaMultiplier.c()).doubleValue();
    }

    public boolean flpParticleFusionUseFop() {
        return ((Boolean) flpParticleFusionUseFop.c()).booleanValue();
    }

    public boolean flpParticleFusionUsePositionLikelihoodClipping() {
        return ((Boolean) flpParticleFusionUsePositionLikelihoodClipping.c()).booleanValue();
    }

    public boolean flpReportLocationOnStepUpdate() {
        return ((Boolean) flpReportLocationOnStepUpdate.c()).booleanValue();
    }

    public boolean flpUseParticleFusion() {
        return ((Boolean) flpUseParticleFusion.c()).booleanValue();
    }

    public double globalAccuracyFactor() {
        return ((Double) globalAccuracyFactor.c()).doubleValue();
    }

    public double gnssMaxStdDevM() {
        return ((Double) gnssMaxStdDevM.c()).doubleValue();
    }

    public double gnssMinStdDevM() {
        return ((Double) gnssMinStdDevM.c()).doubleValue();
    }

    public double gnssRejectionDistanceM() {
        return ((Double) gnssRejectionDistanceM.c()).doubleValue();
    }

    public double gnssRejectionPeriodS() {
        return ((Double) gnssRejectionPeriodS.c()).doubleValue();
    }

    public double gnssStdDevScale() {
        return ((Double) gnssStdDevScale.c()).doubleValue();
    }

    public double initializationWindowLengthS() {
        return ((Double) initializationWindowLengthS.c()).doubleValue();
    }

    public double maxAccuracyM() {
        return ((Double) maxAccuracyM.c()).doubleValue();
    }

    public double maxBearingGapS() {
        return ((Double) maxBearingGapS.c()).doubleValue();
    }

    public double maxGnssAgeForNotRequestingWifiScansS() {
        return ((Double) maxGnssAgeForNotRequestingWifiScansS.c()).doubleValue();
    }

    public double maxGnssEvidenceAgeS() {
        return ((Double) maxGnssEvidenceAgeS.c()).doubleValue();
    }

    public double maxGnssWifiDistanceForGnssOnlyM() {
        return ((Double) maxGnssWifiDistanceForGnssOnlyM.c()).doubleValue();
    }

    public double maxStepEvidenceAgeS() {
        return ((Double) maxStepEvidenceAgeS.c()).doubleValue();
    }

    public double maxWifiEvidenceAgeS() {
        return ((Double) maxWifiEvidenceAgeS.c()).doubleValue();
    }

    public double minAccuracyM() {
        return ((Double) minAccuracyM.c()).doubleValue();
    }

    public double nominalSigmaScaleGnss() {
        return ((Double) nominalSigmaScaleGnss.c()).doubleValue();
    }

    public double nominalSigmaScaleWifi() {
        return ((Double) nominalSigmaScaleWifi.c()).doubleValue();
    }

    public boolean notRequestWifiScansWhenProposingFromGnss() {
        return ((Boolean) notRequestWifiScansWhenProposingFromGnss.c()).booleanValue();
    }

    public long numberOfParticles() {
        return ((Long) numberOfParticles.c()).longValue();
    }

    public boolean outputKalmanFilterEnableReset() {
        return ((Boolean) outputKalmanFilterEnableReset.c()).booleanValue();
    }

    public double outputKalmanFilterResetThresholdM() {
        return ((Double) outputKalmanFilterResetThresholdM.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseFeetPosM() {
        return ((Double) outputLinearKfProcessNoiseFeetPosM.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseFeetVelMps() {
        return ((Double) outputLinearKfProcessNoiseFeetVelMps.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseUnknownPosM() {
        return ((Double) outputLinearKfProcessNoiseUnknownPosM.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseUnknownVelMps() {
        return ((Double) outputLinearKfProcessNoiseUnknownVelMps.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseWheelsPosM() {
        return ((Double) outputLinearKfProcessNoiseWheelsPosM.c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseWheelsVelMps() {
        return ((Double) outputLinearKfProcessNoiseWheelsVelMps.c()).doubleValue();
    }

    public double positionEmitThresholdS() {
        return ((Double) positionEmitThresholdS.c()).doubleValue();
    }

    public double positionProposalGnssBlueskyMinSpeedThresholdMps() {
        return ((Double) positionProposalGnssBlueskyMinSpeedThresholdMps.c()).doubleValue();
    }

    public double positionProposalGnssMaxAccuracyThresholdM() {
        return ((Double) positionProposalGnssMaxAccuracyThresholdM.c()).doubleValue();
    }

    public double positionProposalGnssMinSpeedThresholdMps() {
        return ((Double) positionProposalGnssMinSpeedThresholdMps.c()).doubleValue();
    }

    public double reInitAccuracyThresholdMultiplierGnss() {
        return ((Double) reInitAccuracyThresholdMultiplierGnss.c()).doubleValue();
    }

    public double reInitAccuracyThresholdMultiplierWifi() {
        return ((Double) reInitAccuracyThresholdMultiplierWifi.c()).doubleValue();
    }

    public long requiredStepCount() {
        return ((Long) requiredStepCount.c()).longValue();
    }

    public double resamplingThreshold() {
        return ((Double) resamplingThreshold.c()).doubleValue();
    }

    public boolean resetLocationAfterReinit() {
        return ((Boolean) resetLocationAfterReinit.c()).booleanValue();
    }

    public boolean resetLocationAfterReinitV2() {
        return ((Boolean) resetLocationAfterReinitV2.c()).booleanValue();
    }

    public double speedUpperThresholdMps() {
        return ((Double) speedUpperThresholdMps.c()).doubleValue();
    }

    public double stepLengthFactor() {
        return ((Double) stepLengthFactor.c()).doubleValue();
    }

    public double stepLengthNoiseSigmaM() {
        return ((Double) stepLengthNoiseSigmaM.c()).doubleValue();
    }

    public double stepTimeoutThresholdSeconds() {
        return ((Double) stepTimeoutThresholdSeconds.c()).doubleValue();
    }

    public double temporalHeadingNoiseSigmaRad() {
        return ((Double) temporalHeadingNoiseSigmaRad.c()).doubleValue();
    }

    public double temporalPositionNoiseSigmaM() {
        return ((Double) temporalPositionNoiseSigmaM.c()).doubleValue();
    }

    public boolean useAltitudeFilter() {
        return ((Boolean) useAltitudeFilter.c()).booleanValue();
    }

    public boolean useNStepActivationFilter() {
        return ((Boolean) useNStepActivationFilter.c()).booleanValue();
    }

    public long wifiAccuracyUpperBoundBeforeRejectedMm() {
        return ((Long) wifiAccuracyUpperBoundBeforeRejectedMm.c()).longValue();
    }

    public double wifiMaxStdDevM() {
        return ((Double) wifiMaxStdDevM.c()).doubleValue();
    }

    public double wifiMinStdDevM() {
        return ((Double) wifiMinStdDevM.c()).doubleValue();
    }

    public double wifiRejectionDistanceM() {
        return ((Double) wifiRejectionDistanceM.c()).doubleValue();
    }

    public double wifiRejectionPeriodS() {
        return ((Double) wifiRejectionPeriodS.c()).doubleValue();
    }

    public double wifiStdDevScale() {
        return ((Double) wifiStdDevScale.c()).doubleValue();
    }
}
