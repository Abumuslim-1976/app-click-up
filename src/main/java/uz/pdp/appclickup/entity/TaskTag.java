package uz.pdp.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickup.entity.template.AbsLongEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskTag extends AbsLongEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Task task;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Tag tag;

}
