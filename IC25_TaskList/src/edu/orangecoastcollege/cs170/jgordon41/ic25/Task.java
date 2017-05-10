package edu.orangecoastcollege.cs170.jgordon41.ic25;

import java.io.Serializable;

/*
 * Gordon,Joel
 * IC25_Serilizable task List
 * 5/9/2017
 * CS170
 */

public class Task implements Serializable
{
    String deadline,dueDate;
    int priority;
    String name;
    
    public Task(String deadLine2, String dueDate2, int priority, String name)
    {
        super();
        this.deadline = deadLine2;
        this.dueDate = dueDate2;
        this.priority = priority;
        this.name = name;
    }
    public Task (Task newTask){
        deadline = newTask.getDeadline();
        dueDate = newTask.getDueDate();
        priority = newTask.getPriority();
        name = newTask.getName();
    }
    public String getDeadline()
    {
        return deadline;
    }
    public String getDueDate()
    {
        return dueDate;
    }
    public int getPriority()
    {
        return priority;
    }
    public String getName()
    {
        return name;
    }
    public void setDeadline(String deadline)
    {
        this.deadline = deadline;
    }
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Task other = (Task) obj;
        if (deadline != other.deadline) return false;
        if (dueDate != other.dueDate) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (priority != other.priority) return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "Task [Name=" + name + ", dueDate=" + dueDate + ", deadline=" + deadline + ", priority=" + priority
                + "]";
    }
    
    
    
    
    
}
