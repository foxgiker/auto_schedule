package com.foxgiker.schedule.model.prodline;

import com.foxgiker.schedule.model.WorkBatch;

import java.util.Date;
import java.util.List;

public class ProdLineThread implements Runnable {

    private String name;

    // 节拍：表示每小时生产多少个产品
    private Integer cycleTime;

    // 单个产品的生产时间
    private Double  singleProductTime;

    // 产线启动时间
    private Date startDate;

    // 产线停止时间
    private Date stopDate;

    private Date currentTime;

    // 产线当前状态
    private ProdLineStatus status;

    // 当前运行班次
    private WorkBatch currentWorkBatch;

    private List<WorkBatch> workBatches;

    // 产线当前生产数量
    private Integer amount;

    public ProdLineThread(String name, Integer cycleTime) {
        this.name = name;
        this.cycleTime = cycleTime;
    }

    public void setWorkBatches(List<WorkBatch> workBatches) {
        this.workBatches = workBatches;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (WorkBatch workBatch : workBatches) {
            // TODO 生产单个产品
            // TODO 记录生产时间
        }
    }


    private void runByWorkBatch(WorkBatch workBatch) {
        currentTime = workBatch.getStartDate();
        status = ProdLineStatus.RUNNING;
        while (status != ProdLineStatus.STOPPED) {
            currentTime += 1;

            if(currentTime >= workBatch.getEndDate()){
                status = ProdLineStatus.STOPPED;
            }
        }
    }

    // 产线当前状态






}
