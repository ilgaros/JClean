![Alt text](http://g.gravizo.com/g?
@startuml
title "MVC Sequence Diagram JClean"
actor user #blue
participant View as V #99FF9
participant Control as C
participant Model as M

user->V: �������
V->C: �������� ��������� � �������
C->M: ������ �� ���������� ������
C->M: ������ �� ��������� ����������� ������
M-->C: ��������� ������
C->V: �������� ����������� ������ �� ���������
V->V: ���������� �����������
@enduml
)