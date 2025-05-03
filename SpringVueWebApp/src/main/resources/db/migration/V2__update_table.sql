UPDATE tasks
SET status = UPPER(status)
WHERE status IS NOT NULL;
